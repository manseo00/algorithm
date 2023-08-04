import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        String[] answer = Arrays.stream(arr)
                                .filter(str -> !str.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        return answer;
    }
}