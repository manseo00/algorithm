class Solution {
    public int solution(int[] numbers) {
        int answer = -100000000;
        int mul = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                mul = numbers[i]*numbers[j];
                if(i==j) break;
                else if(mul>answer){
                    answer = mul;
                }
            }
        }
        
        return answer;
    }
}