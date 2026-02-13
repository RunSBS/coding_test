class Solution {
    public int solution(int n) {
        int answer = 0;
        // n % x == 1
        // x는 n보다 작은수다.
        for(int i=n; i>=1; i--){
            if(n%i == 1){
                answer = i;
            }
        }
        return answer;
    }
}