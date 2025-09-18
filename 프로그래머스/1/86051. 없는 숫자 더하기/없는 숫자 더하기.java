
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for(int i=0;i<10;i++){
            int stk = 0;
            for(int number:numbers){
                if(number==i){
                    break;
                }
                else{
                    stk+=1;
                }
            }
            if(stk == numbers.length)
                answer+=i;
        }
        return answer;
    }
}