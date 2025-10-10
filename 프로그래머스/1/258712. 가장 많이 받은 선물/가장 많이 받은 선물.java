import java.util.HashMap;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> fNum = new HashMap<>();
        int len = friends.length;
        for(int i=0;i<len;i++){
            fNum.put(friends[i],i);
        }
        int[][] giftCount = new int[len][len];
        int[] total = new int[len];
        for(String gift: gifts){
            String[] idx = gift.split(" ");
            int aidx = fNum.get(idx[0]);
            int bidx = fNum.get(idx[1]);
            giftCount[aidx][bidx] += 1;
            total[aidx] += 1;
            total[bidx] -= 1;
        }

        int answer = 0;
        int[] counts = new int[len];
        for(int idx=0;idx<len-1;idx++){
            for(int comp = idx+1;comp<len;comp++){
                if(giftCount[comp][idx] < giftCount[idx][comp]) counts[idx]+=1;
                else if (giftCount[comp][idx] > giftCount[idx][comp]) counts[comp] += 1;
                else {
                    if(total[idx] > total[comp]) counts[idx]+=1;
                    else if (total[idx] < total[comp]) counts[comp] +=1;
                }
            }
        }
        for(int count:counts){
            answer = Math.max(answer, count);
        }
        return answer;
    }
}