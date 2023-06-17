import java.util.Arrays;

class Solution {
    public int solution(int n) {
        int[] answer = Arrays.stream(String.valueOf(n).split("")).
                        mapToInt(Integer::parseInt).toArray(); 
        int sum = 0;
        for(int i=0; i<answer.length; i++){
            sum += answer[i];
        }
        
        return sum;
    }
}