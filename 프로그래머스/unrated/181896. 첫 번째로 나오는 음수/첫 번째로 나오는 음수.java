class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int i=0;
        while(i<num_list.length){
            if(num_list[i]<0){
                answer = i;
                break;
            }
            i++;
        }
        
        return answer;
    }
}