class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mul = 1;
        for(int i=0; i<num_list.length; i++){
            mul *= num_list[i];
            sum += num_list[i];
        }
        sum = (int)Math.pow(sum, 2);
        if(mul>sum){
            answer = 0;
        }else if(mul<sum){
            answer = 1;
        }
        
        return answer;
    }
}