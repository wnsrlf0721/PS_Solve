class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int div = gcd(Math.max(a,b),Math.min(a,b));
        a=a/div;
        b=b/div;
        while(b%2==0){
            b/=2;
        }
        while(b%5==0){
            b/=5;
        }
        answer = b==1? 1:2;
        return answer;
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int c= a%b;
            a=b;
            b=c;
        }
        return a;
    }
}