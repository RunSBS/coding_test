class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){ // s가 짝수일 때
            // qwer일 때, 4/2 = 2 인덱스와 4/2 -1인덱스를 합쳐서 반환, 순서만 바꿔서
            answer =  String.valueOf(s.charAt((s.length()/2) -1)) + String.valueOf(s.charAt(s.length()/2));
            
        }else{ // s가 홀수일 때
            // abcde일 때, 5/2 = 2 인덱스를 반환
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}