class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int idx=i;idx<=j;idx++){
            int target= idx;
            while(target!=0){
                if(target%10 == k)
                    answer++;
                target/=10;
            }
        }
        return answer;
    }
}