class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int c1 = (int)'a';
        int c2 = (int)'z';
        int c3 = (int)'A';
        int c4 = (int)'Z';
        int c5 = ' ';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println((int)' ');
        
        int[] sArr = new int[s.length()];
        for(int i=0; i<s.length(); i++){
            int current = (int)s.charAt(i);
            if(current == 32){
                sArr[i] = current;
            }else{
                if(current >= c1 && current <= c2){
                    if((current + n) > c2 ){ // 'z'를 넘어갈 떄,
                    sArr[i] = current + n - 26;
                    }else{
                        sArr[i] = current + n; // 단순히 n을 더하기
                    }
                }
            
                if(current >= c3 && current <= c4){
                     if((current + n) > c4){ // 'Z'를 넘어갈 때,
                        sArr[i] = current + n - 26;
                    }else{
                        sArr[i] = current + n; // 단순히 n을 더하기
                    }
                }
            }
        }
        
        for(int i=0; i<sArr.length; i++){
            answer += (char)sArr[i];
        }
        return answer;
    }
}