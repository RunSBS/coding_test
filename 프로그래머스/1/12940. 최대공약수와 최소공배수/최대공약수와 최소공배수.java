class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대공약수 = 두 수가 둘 다 나눌 수 있는 수
        // 최소공배수 = 두 수가 둘 다 나누어지는 수
        
        int min = Math.min(n,m);
        
        for(int i=min; i>0; i--){
            if(n % i ==0 && m % i ==0){
                answer[0] = i;
                break;
            }
        }
        int count = n > m ? n : m;
        while(true){
            if(count % n ==0 && count % m ==0){
                answer[1] = count;
                break;
            }
            count++;
        }
        return answer;
    }
}