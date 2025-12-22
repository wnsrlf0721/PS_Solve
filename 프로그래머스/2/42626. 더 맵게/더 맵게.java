import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int idx: scoville){
            minHeap.offer(idx);
        }
        int answer = 0;
        // 가장 낮은 숫자가 K보다 작은 경우 루프
        while(minHeap.peek()<K){
            // minHeap 전체 길이가 2 이상일 경우
            if(minHeap.size()>=2){
                int a = minHeap.poll();
                int b = minHeap.poll();
                minHeap.offer(a+2*b);
                answer ++;
            }
            // 길이가 1 이하인 경우
            else{
                return -1;
            }

        }
        return answer;
    }
}