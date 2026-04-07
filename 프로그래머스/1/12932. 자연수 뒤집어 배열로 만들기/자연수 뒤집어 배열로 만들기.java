import java.util.*;

class Solution {
    public int[] solution(long n) {
        List<Integer> resultList = new ArrayList<>(); 
        while(n != 0){
            int k = (int) (n%10);
            resultList.add(k);
            n/=10;
        }
        int[] answer = {};
        answer = resultList.stream()
            .mapToInt(Integer::intValue).toArray();
        return answer;
    }
}