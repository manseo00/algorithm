class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int c = 1;
        while(c<=n){
            answer[c-1] = (long)x*c;
            c++;
        }
        
        return answer;
    }
}