class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if(price>=100000 && price <300000) answer = (int)(price*0.95);
        else if(price>=300000 && price <500000) answer = (int)(price*0.90);
        else if(price>=500000 && price <= 1000000) answer = (int)(price*0.8);
        else answer = price;
        return answer;
    }
}