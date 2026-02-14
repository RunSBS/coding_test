class Solution {
    public int solution(String s) {
        int answer = 0;
        // s 를 char 배열로 저장
        // 맨 앞이 -인지 검사한다.
        // char 배열의 값을 int배열로저장 ( - 기호는 제외 )
        // int배열의 뒤인덱스부터 int[i] * 10의 배열크기승 으로 합을 구해 answer에 저장
        // -면 answer를 -를 붙여 저장
        char[] chars = s.toCharArray();
        int start = 0;
        
        if(chars[0] == '-' || chars[0] == '+'){
            start = 1;
        }
        int[] ints = new int[chars.length - start];
        for(int i=0; i<ints.length; i++){
            ints[i] = chars[i+start] -'0';
        }
        
        int ten = 1;
        for(int i=ints.length-1; i>=0; i--){
            answer += ints[i] * ten;
            ten *= 10;
        }
        if(chars[0] == '-'){
            answer = -answer;
        }
        
        return answer;
    }
}