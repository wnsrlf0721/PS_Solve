import java.util.HashMap;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int ans_idx = 0;
        //HashMap으로 두개 선언
        //n보다 작은 값은 HashMap<Integer,Integer> minusDiff
        //n보다 큰 값은 plusDiff
        //key-> abs(numlist-n), value->numlist
        HashMap<Integer,Integer> minusMap = new HashMap<>();
        HashMap<Integer,Integer> plusMap = new HashMap<>();
        
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]==n){
                answer[ans_idx++] = numlist[i];
            }
            else if(numlist[i]>n){
                plusMap.put(Math.abs(numlist[i]-n),numlist[i]);
            }
            else{
                minusMap.put(Math.abs(numlist[i]-n),numlist[i]);
            }
        }
        
        for(int i=1;i<10000;i++){
            if(plusMap.containsKey(i)){
                answer[ans_idx++]= plusMap.get(i);
            }
            if(minusMap.containsKey(i)){
                answer[ans_idx++]= minusMap.get(i);
            }
        }
        return answer;
    }
}