import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] sumScore = new int[score.length];
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int idx = 0;idx<score.length;idx++){
            int idxSum = (score[idx][0]+score[idx][1]);
            sumScore[idx] = idxSum;
            set.add(idxSum);
        }
        int prior = 1;
        for(int idx:set){
            int dup = 0;
            for(int i=0;i<sumScore.length;i++){
                if(sumScore[i]==idx){
                    answer[i] = prior;
                    dup++;
                }
            }
            prior+=dup;
        }
        return answer;
    }
}