class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        // 명함을 큰 쪽을 가로로 설정
        // 제일큰 가로 값과 제일 큰 세로를 곱하기
        
        int maxX = 0;
        int maxY = 0;
        
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] > maxX){
                maxX = sizes[i][0];
            }
            if(sizes[i][1] > maxY){
                maxY = sizes[i][1];
            }
        }
        answer = maxX * maxY;
        return answer;
    }
}