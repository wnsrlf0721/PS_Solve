class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int idx=2;idx<=n-1;idx++){
            if((n-1)%idx==0){
                answer = idx;
                break;
            }
        }
        return answer;
    }
}