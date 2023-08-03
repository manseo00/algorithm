class Solution {
    public String solution(int age) {
        String answer = "";
        String proAge = "abcdefghij";
        String[] arr = String.valueOf(age).split("");
        
        for (int i = 0; i < arr.length; i++) {
        	answer += proAge.charAt(Integer.valueOf(arr[i]));
		}
        return answer;
    }
}