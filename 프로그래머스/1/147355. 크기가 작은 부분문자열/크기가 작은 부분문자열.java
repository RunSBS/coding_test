class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        char[] arr = t.toCharArray();
        
        // arr가 7길이 p가 3길이
        // p길이 만큼 가져와야 하므로 (arr길이 - p길이) => 4까지 반복
        for(int i=0; i<=arr.length - p.length(); i++){
            String temp = "";
            for(int k=i; k<i+p.length(); k++){
                temp += arr[k];
            }
            if(Long.parseLong(temp) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
