import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[20];

        int count = 0;
        while(n > 0){
            arr[count++] = n % 3;
            n /= 3;
        }
        for(int i=0; i < count; i++){
            answer += arr[i] * Math.pow(3,count-1-i);
        }
        return answer;
    }
}