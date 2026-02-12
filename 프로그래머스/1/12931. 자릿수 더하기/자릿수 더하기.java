import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int ten = 10;
        
        while(ten <= n *10){
            if(ten <= 1000000000){
                answer += (n % ten) / (ten/10);
                ten *= 10;
            }
        }
        
        return answer;
    }
}