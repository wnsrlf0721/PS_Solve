import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int idx = 0;idx<str.length();idx++){
            answer += str.charAt(idx)-'0';
        }
        return answer;
    }
}