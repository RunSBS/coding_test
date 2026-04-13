import java.util.*;
class Solution {
    public int solution(String s) {
        String answer = "";
        Map<String,String> map = new LinkedHashMap<>();
        // Map에 영어 - 숫자 세팅
        map.put("zero","0");
        map.put("one","1");
        map.put("two","2");
        map.put("three","3");
        map.put("four","4");
        map.put("five","5");
        map.put("six","6");
        map.put("seven","7");
        map.put("eight","8");
        map.put("nine","9");
        
        // s에서, indexOf(map)을 활용해서 문자열 s의 영어를 숫자로 대체
        for (String key : map.keySet()) {
            if(s.indexOf(key) != -1){
                s = s.replace(key, map.get(key));
            }
        }
        answer = s;
        
        return Integer.parseInt(answer);
    }
}