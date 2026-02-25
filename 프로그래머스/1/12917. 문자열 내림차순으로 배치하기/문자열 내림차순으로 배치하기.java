class Solution {
    public String solution(String s) {
        String answer = "";
        // s를 큰것부터 작은 순으로 정렬
        // s에서 제일 큰 값을 구하고 answer에 더함
        // s에서 그 값만 제거
        // 반복...
        while(s.length() >0){
            int maxIdx = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) > s.charAt(maxIdx)){
                    maxIdx = i;
                }
            }
            answer += s.charAt(maxIdx);
            s = s.substring(0,maxIdx)+s.substring(maxIdx+1);
        }
        return answer;
    }
}