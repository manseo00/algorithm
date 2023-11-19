class Solution {
    public int[] solution(int n) {
        int a = 0;
        if(n%2==0) a = n/2;
        else a = n/2+1;
        
        int[] answer = new int[a];
        int j=0;
        for(int i=1; i<=n; i++){
            if(i%2!=0) {
                answer[j] = i;
                j++;
            } 
        }
        
        return answer;
    }
}