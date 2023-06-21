import java.util.Arrays;
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] arr = num_str.split("");
        int[] sus = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(); 
        
        for(int i=0; i<sus.length; i++){
            answer += sus[i];
        }
        
        return answer;
    }
}