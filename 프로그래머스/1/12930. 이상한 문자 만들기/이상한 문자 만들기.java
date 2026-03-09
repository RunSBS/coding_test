class Solution {
    public String solution(String s) {
        String answer = "";
        // 문자열 s를 공백을 기준으로 나눠서 배열에 저장하기
        // 배열의 각 인덱스의 값을 홀수, 짝수를 기준으로 소문자 대문자로 변환하여 저장
        // 다시 모든 인덱스를 합쳐서 하나의 문자열로 반환
        
        String[] arr = s.split(" ", -1);
        
        for(int i=0; i<arr.length; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            for(int k=0; k<sb.length(); k++){
                if(k % 2 == 0){
                    sb.setCharAt(k,Character.toUpperCase(sb.charAt(k)));
                }else{
                    sb.setCharAt(k,Character.toLowerCase(sb.charAt(k)));
                }
            }
            answer += sb.toString();
            if(i < arr.length -1){
                answer += " ";
            }
        }
        return answer;
    }
}