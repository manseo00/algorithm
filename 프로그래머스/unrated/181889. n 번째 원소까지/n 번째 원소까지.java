class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int i = 0;
        while(i < n){
            answer[i] = num_list[i];
            i++;
        }
        
        return answer;
    }
}