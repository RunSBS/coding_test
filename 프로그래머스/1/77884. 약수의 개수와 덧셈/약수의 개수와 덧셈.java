class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        // left ~ right까지 반복
        // 내부 루프에서 1부터 자기자신까지 반복
        // 약수의 갯수를 구함.
        // answer에 갯수가 짝수/홀수에 따라서 더하고 빼고 다음 루프 진행
        
        int count;
        for(int i=left; i<=right; i++){
            count = 0;
            for(int k=1; k<=i; k++){
                if(i % k == 0){
                    count ++;
                }
            }
            if(count % 2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }
}