class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDistance = Integer.MAX_VALUE;

        for (int num : array) {
            int distance;

            if (num <= n) {
                distance = n - num;
            } else {
                distance = num - n;
            }

            if (distance < minDistance) {
                minDistance = distance;
                answer = num;
            } else if (distance == minDistance) {
                // 거리가 같다면 수가 작은 것을 선택
                answer = Math.min(answer, num);
            }
        }

        return answer;
    }
}