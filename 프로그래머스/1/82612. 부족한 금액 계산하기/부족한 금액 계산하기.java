class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        // answer = money - (price * 1 + price * 2 + ... price * count)
        // if(answer > 0) return 0; else return answer;
        
        long totalPrice = 0;
        for(int i=1; i<=count; i++){
            totalPrice += price*i;
        }
        answer = money - totalPrice;
        if(answer >= 0){
            return 0;
        }
        return -answer;
    }
}