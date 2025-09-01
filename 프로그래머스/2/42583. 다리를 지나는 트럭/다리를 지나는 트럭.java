import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int total_time = 0; //총 소요시간

        //bridge 길이만큼 사전 세팅 [0,0,...0]
        Queue<Integer> bridge = new LinkedList<>();
        for(int i=0;i<bridge_length;i++) {
            bridge.offer(0);
        }

        int idx_weight = 0; //현재 bridge 무게
        int truck_count = 0; //현재 bridge 위에있는 트럭 count

        //첫번째 트럭부터 반복
        int idx = 0;
        while(idx<truck_weights.length){

            int next = 0;

            //다리 맨앞 로직 제거
            if(bridge.peek() !=0){
                idx_weight -= bridge.peek();
                truck_count -=1;
            }
            bridge.poll(); //맨 앞의 숫자 제거

            // 조건 1: 현재 bridge 무게 + 새로 추가할 트럭 무게가 다리가 견딜수 있는 무게 이하여야함
            // 조건 2: 다리 길이 이상으로 트럭이 들어올 수 없음

            // 트럭이 더 들어올 수 있는지 확인하는 로직 (조건 1, 2 모두 성립 시)
            if(weight >= idx_weight + truck_weights[idx] && bridge_length > truck_count){
                next = truck_weights[idx];
                idx_weight += truck_weights[idx];
                truck_count += 1; //다리 위의 트럭 수 추가
                idx+=1;
            }
            //Queue에 새로운 truck을 추가하는 로직
            bridge.offer(next); //새로 들어올 숫자 추가(0 or truck)
            total_time +=1;
        }

        //나머지 시간 추가

        return total_time + bridge_length; //모든 트럭이 다리를 건널 때 걸리는 시간 (초)
    }
}