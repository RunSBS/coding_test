class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        char[] c_arr = phone_number.toCharArray();
        // c_arr의 뒤에서 4개를 제외하고 다 *로 반환
        // 다시 answer = new String(c_arr);
        // 010 1234 5678
        for(int i=c_arr.length-5; i>=0; i--){
            c_arr[i] = '*';
        }
        answer = new String(c_arr);
        return answer;
    }
}