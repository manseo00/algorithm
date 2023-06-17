class Solution {
    public int[] solution(int start, int end) {
        int[] answer = new int[start-end+1];
        int n=0;
        while(true){
            answer[n] = start;
            n++;
            if(start==end) break;
            start--;
        }
        
        return answer;
    }
}