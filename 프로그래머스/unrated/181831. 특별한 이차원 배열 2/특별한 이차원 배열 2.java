class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==arr[j][i]) count++;
            }
        }
        if(count == arr.length*arr.length) answer = 1;
        
        return answer;
    }
}