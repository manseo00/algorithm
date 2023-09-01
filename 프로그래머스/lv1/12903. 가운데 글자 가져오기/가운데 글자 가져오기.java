class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        if(str.length%2==0){
            answer = s.substring(str.length/2-1,str.length/2+1);
        }else{
            answer = s.substring(str.length/2,str.length/2+1);
        } 
        
        return answer;
    }
} 