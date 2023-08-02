class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        while(true){
            int j=0;
            for(int i=n; i<num_list.length; i++){
                answer[j] = num_list[i];
                j++;
            }
            for(int i=0; i<n; i++){
                answer[j] = num_list[i];
                j++;
            }
            break;
        }
        
        return answer;
    }
}