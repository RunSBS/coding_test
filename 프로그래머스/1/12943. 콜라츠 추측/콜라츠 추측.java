class Solution {
    public int solution(long num) {
        int answer = 0; // count 값
        // 2의 배수가 될 때까지 하는 듯
        if(num == 1){
            return 0;
        }
        while(num != 1){
            answer += 1;
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = (num * 3) +1;
            }
        }
        if(answer >= 500){
            return -1;
        }
        return answer;
    }
}