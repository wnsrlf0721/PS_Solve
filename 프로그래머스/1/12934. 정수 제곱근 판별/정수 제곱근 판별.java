
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sq = Math.sqrt(n);
        long sq2 = (long) sq;
        answer = sq - sq2 == 0 ? (sq2+1)*(sq2+1) : -1;
        return answer;
    }
}