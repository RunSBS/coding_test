class Solution {
    public int[] solution(long n) {
        String str_n = String.valueOf(n);
        int[] answer = new int[str_n.length()];
        long ten = 10;
        int i =0;
        
        // 12345 % 10 = 5
        // (12345 / 10) % 10 = 4
        // (12345 / 10 / 10) % 10 = 3
        // 12 % 10 = 2
        // 1 % 10 = 1
        
        // 1 / 10 = 0 => 종료
        while(n > 0){
            answer[i++] = (int)(n%10);
            n /= 10;
        }
        return answer;
    }
}