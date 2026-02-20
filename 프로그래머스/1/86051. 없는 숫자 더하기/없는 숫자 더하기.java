class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 0~9까지 number의 i번쨰 숫자랑 비교, 같다면 boolean 배열에 i번째 인덱스값을 true 설정
        // boolean배열에서 false인 값만 그 인덱스를 answer에 추가
        
        boolean[] arr = new boolean[10]; // 크기 10
        outer:
        for(int i=0; i<numbers.length; i++){
            for(int k=0; k<=9; k++){
                if(numbers[i] == k){
                    arr[k] = true;
                    continue outer;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == false){
                answer += i;
            }
        }
        return answer;
    }
}