class Solution {
    public String solution(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        String answer = "";
        if(length % 2 == 1){
            answer += arr[length/2];
        }
        else{
            answer += arr[length/2-1];
            answer += arr[length/2];
        }
        return answer;
    }
}