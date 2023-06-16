class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = String.valueOf(a) +String.valueOf(b);
                
        if(Integer.parseInt(str1) < 2*a*b){
            answer += 2*a*b;
        }else{
            answer += Integer.parseInt(str1);
        }
        
        return answer;
    }
}