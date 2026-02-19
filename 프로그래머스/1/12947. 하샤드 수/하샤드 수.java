class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = String.valueOf(x);
        int sum = 0;
        int[] intList = new int[s.length()];
        for(int i=0; i< s.length(); i++){
            intList[i] = s.charAt(i)-'0';
            sum += intList[i];
        }
        if(x % sum == 0){
            return answer;
        }else{
            return !answer;
        }
    }
}