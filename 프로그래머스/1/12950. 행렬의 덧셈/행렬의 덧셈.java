class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        // 루프는 arr1.length까지 반복
        // answer[0][i] = arr1[0][i] + arr2[0][i]
        // answer[1][i] = arr1[1][i] + arr2[1][i]
        
        for(int k=0; k<arr1.length; k++){
            for(int i=0; i<arr1[0].length; i++){
            answer[k][i] = arr1[k][i] + arr2[k][i];
        }
        }

        return answer;
    }
}