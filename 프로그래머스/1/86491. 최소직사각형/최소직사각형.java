class Solution {
    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getArea(){
            return x*y;
        }
    }
    
    public int solution(int[][] sizes) {
        int[] a = {sizes[0][0], sizes[0][1]};
        int[] b = {sizes[0][1], sizes[0][0]};
        for(int len = 1; len<sizes.length; len++){
            int[] aa = {Math.max(a[0],sizes[len][0]),Math.max(a[1],sizes[len][1])};
            int[] ab = {Math.max(a[0],sizes[len][1]),Math.max(a[1],sizes[len][0])};
            a = (aa[0]*aa[1] > ab[0]*ab[1])? ab: aa;
            
            int[] ba = {Math.max(b[0],sizes[len][0]),Math.max(b[1],sizes[len][1])};
            int[] bb = {Math.max(b[0],sizes[len][1]),Math.max(b[1],sizes[len][0])};
            b = (ba[0]*ba[1] > bb[0]*bb[1])? bb: ba;
        }
        return Math.min(a[0]*a[1],b[0]*b[1]);
    }
} 