import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> result = new ArrayList<Integer>();
        
        for (String str : intStrs) {
            int i = Integer.parseInt(str.substring(s, s + l));
            if (i > k) {
                result.add(i);
            }
        }
        
        int[] answer = result.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}