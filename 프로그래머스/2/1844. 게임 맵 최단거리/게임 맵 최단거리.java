import java.util.*;
class Solution {
    // 좌표 x,y 를 가지는 클래스 생성 
    public static class Point{
        int x;
        int y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void bfs(int[][] maps,int n, int m){
        int[][] udlr = {{-1,0},{1,0},{0,-1},{0,1}}; //위, 아래, 좌, 우 이동 좌표
        boolean[][] visited = new boolean[n][m]; 
        
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0,0));
        visited[0][0]=true;
        
        while(!queue.isEmpty()){
            Point p = queue.poll();
            for(int idx=0;idx<4;idx++){
                int nx = p.x+udlr[idx][0];
                int ny = p.y+udlr[idx][1];
                
                //maps 영역 밖으로 벗어난 경우 미실시
                if(nx<0 || nx>=n || ny<0 || ny>=m) continue; 
                // 값이 -1 (벽)인 경우 or 이미 방문한 경우 미실시
                if(maps[nx][ny]==0 || visited[nx][ny]) continue;
                maps[nx][ny]=maps[p.x][p.y]+1;
                visited[nx][ny] = true;
                queue.offer(new Point(nx,ny));
            }
        }
    }
    public int solution(int[][] maps) {
        /**using BFS, find minimum path_length (0,0) to (n-1,m-1)*/
        int n=maps.length; 
        int m=maps[0].length;
        bfs(maps,n,m);
        
        
        return maps[n-1][m-1]==1 ? -1 : maps[n-1][m-1];
    }
}