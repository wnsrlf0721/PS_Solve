import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> uniqueSum = new TreeSet<>();
        int[] answer = {};
        int len = numbers.length;
        for(int i=0;i<len-1;i++){
            for(int ii=i+1;ii<len;ii++){
                uniqueSum.add(numbers[i]+numbers[ii]);
            }
        }
        answer = uniqueSum.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}