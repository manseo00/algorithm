class Solution {
    public int solution(String my_string) {       
        String[] parts = my_string.split(" ");
        int answer = Integer.parseInt(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            String operator = parts[i];
            int operand = Integer.parseInt(parts[i + 1]);

            if (operator.equals("+")) {
                answer += operand;
            } else if (operator.equals("-")) {
                answer -= operand;
            }
        }
        
        return answer;
    }
}