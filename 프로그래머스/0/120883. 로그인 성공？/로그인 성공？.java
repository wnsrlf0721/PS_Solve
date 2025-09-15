class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(String[] db_idx: db){
            if(id_pw[0].equals(db_idx[0])){
                answer = id_pw[1].equals(db_idx[1]) ? "login" : "wrong pw";
            }
        }
        return answer;
    }
}