class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        // 내적 = 각 배열의 같은 인덱스끼리 곱한 것들의 합
        for(int i=0; i<a.length; i++){
            int x = a[i]*b[i];
            answer += x;
        }
        return answer;
    }
}