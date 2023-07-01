class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        while(true){
            int len = (int)Math.pow(2, i);
            System.out.println(len);
            if(arr.length>len){
                i++;
            }else if(arr.length==len){
                answer = new int[len];
                break;
            }else if(arr.length<len){
                answer = new int[len];
                break;
            }
        }
        
        for(int j=0; j<arr.length; j++){
            answer[j] = arr[j];
        }
        
        return answer;
    }
}