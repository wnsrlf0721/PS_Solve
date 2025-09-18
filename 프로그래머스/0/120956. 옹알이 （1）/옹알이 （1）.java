class Solution {
    public int solution(String[] babbling) {
        String[] speaks = {"aya","ye","woo","ma"};
        int answer = 0;
        for(String babble: babbling){
            int babbleLen = babble.length();
            int babSum = 0;
            for(String speak: speaks){
                if(babble.contains(speak)){
                    babSum += speak.length();
                }
            }
            if(babbleLen == babSum)
                answer++;
        }
        return answer;
    }
}