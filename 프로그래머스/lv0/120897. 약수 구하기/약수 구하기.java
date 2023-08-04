class Solution {
    public int[] solution(int n) {
        int count=0;
        String str="";
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
                str+=i;
            }
        }
        
        int[] answer = new int[count];
        int j = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer[j]=i;
                j++;
            }
        }
        
        return answer;
    }
}