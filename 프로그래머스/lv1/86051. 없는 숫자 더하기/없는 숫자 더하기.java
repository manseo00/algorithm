class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        int i=0;
        while(i<numbers.length){
            answer -= numbers[i];
            i++;
        }
        
        return answer;
    }
}