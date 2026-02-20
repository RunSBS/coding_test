import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                // answer에 arr[i]를 추가
                list.add(arr[i]);
            }
        }
        if(list.size() == 0){
            list.add(-1);
        }
        Collections.sort(list);
        return list;
    }
}