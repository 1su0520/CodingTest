class Solution {
    public int solution(int price) {
        switch(price/100000){
            case 0:
                break;
                
            case 1,2:
                price*= 0.95;
                break;
            case 3,4:
                price*= 0.90;
                break;
            default:
                price*= 0.80;
                break;
        }
        int answer = price;
        return answer;
    }
}