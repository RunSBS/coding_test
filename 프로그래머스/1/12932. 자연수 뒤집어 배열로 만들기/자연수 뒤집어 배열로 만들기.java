class Solution {
    public int[] solution(long n) {
        String str_n = String.valueOf(n);
        int[] answer = new int[str_n.length()];
        long ten = 10;
    
        int i =0;
        
        // 12345 % 10 = (12345 % 10) / (10/10) = 5
        // 12345 % 100 = 45 / 10; => 4
        // 12345 % 1000 = 345 / 100 => 3
        // 12345 % 10000 = 2345 / 1000 => 2
        // ten = 100000, 
        // if(ten > 12345) 
        //    value = n / (ten/10);
        
        // if n = 10,
        while(i < answer.length){
            long value = (n % ten) / (ten/10);
            answer[i++] = (int)value;
            ten *= 10;
        }
        return answer;
    }
}