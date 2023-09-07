class Solution {
    public int[] solution(int n) {
        int count = 0;
        int temp = n;
        
        while (temp != 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = 3 * temp + 1;
            }
            count++;
        }
        
        int[] answer = new int[count+1];
        answer[0] = n; 
        
        for (int i = 1; i <= count; i++) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            answer[i] = n;
        }
        
        return answer;
    }
}