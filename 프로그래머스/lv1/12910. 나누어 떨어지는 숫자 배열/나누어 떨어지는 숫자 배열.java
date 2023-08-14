import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                count++;
            }
        }
        
        if(count==0){
            int[] answer = new int[1];
            int cnt=0;
            answer[cnt]=-1;
            return answer;
        }else{
            int[] answer = new int[count];
            int cnt=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]%divisor==0){
                    answer[cnt]=arr[i];
                    cnt++;
                }
            }
            Arrays.sort(answer);
            return answer;
        }
        
        
    }
}