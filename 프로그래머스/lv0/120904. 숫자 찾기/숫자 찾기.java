import java.util.*;
import java.util.stream.Stream;
class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int[] arr = Stream.of(String.valueOf(num).
                              split("")).mapToInt(Integer::parseInt).toArray();
        int i = 0;
        while(i < arr.length){
            if(arr[i]==k) {
                answer = i+1;
                break;
            }
            i++;
        }
        
        return answer;
    }
}