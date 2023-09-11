class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a = i; a <= j; a++) {
            int number = a;
            
            while (number > 0) {
                int b = number % 10;
                if (b == k) {
                    answer++;
                }
                number /= 10;
            }
        }
        
        return answer;
    }
}