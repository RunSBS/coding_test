class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // n을 문자열로 변환
        // int 배열로 toCharAt(i) -'0' 사용해서 저장
        // 버블정렬 역순으로 int 배열을 정렬
        // 다시 int 배열의 요소 하나하나씩 문자열로 바꿔 문자열 더하기
        // Long타입으로 바꿔서 반환
        
        String s = String.valueOf(n);
        
        int[] arr = new int[s.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = s.charAt(i) - '0';
        }
        
       for(int k=0; k<arr.length-1; k++){
           for(int i = arr.length-1; i>k; i--){
                if(arr[i] > arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
            }
       }

        String s_arr = "";
        for(int i=0; i<arr.length; i++){
            s_arr += String.valueOf(arr[i]);
        }
        answer = Long.parseLong(s_arr);
        return answer;
    }
}