class Solution {
    public String solution(int n) {
        String answer = "";
        // 홀수면 첫글자를 "수"로 고정, 3,5,7로 늘어나면 "박수"를 추가
        // 짝수면 첫글자를 "수박"으로 고정, 4,6,8로 늘어나면 "수박"을 추가
        
        String add = "";
        
        if(n % 2 == 0){
            add = "수박";
            for(int i=0; i<n/2; i++){
                answer += add;
            }
        }else{
            answer += "수";
            add = "박수";
            for(int i=0; i<n/2; i++){
                answer += add;
            }  
        }
        return answer;
    }
}