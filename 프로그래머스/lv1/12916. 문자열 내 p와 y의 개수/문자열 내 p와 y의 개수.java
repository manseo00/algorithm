class Solution {
    boolean solution(String s) {
        boolean answer = true;

        String[] arr = s.split("");	
        int a=0;
        int b=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("p")||arr[i].equals("P")){
                a++;
            }else if(arr[i].equals("y")||arr[i].equals("Y")){
                b++;
            }
        }
        if(a!=b){
            answer = false;
        }

        return answer;
    }
}