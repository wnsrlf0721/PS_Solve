class Solution {
    public int[][] solution(int n) {
        int[] square = new int[4];
        int[][] answer = new int[n][n];
        int num =1;
        int colStart = 0;
        int colEnd = n-1;
        int rowStart = 0;
        int rowEnd = n-1;
        while(num<=n*n){
            for(int i=rowStart;i<=rowEnd;i++){
                answer[colStart][i] = num++;
            }
            colStart++;
            for(int i=colStart;i<=colEnd;i++){
                answer[i][rowEnd] = num++;
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                answer[colEnd][i] = num++;
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--){
                answer[i][rowStart] = num++;
            }
            rowStart++;
        }
        return answer;
    }
}