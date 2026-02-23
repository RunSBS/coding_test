class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        if(arr.length == 1){
            return new int[]{-1};
        }
        // arr에서 가장 작은 수를 제거하고 반환, 빈배열 반환 시 -1 반환
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != min){
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}