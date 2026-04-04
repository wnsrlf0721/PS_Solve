import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> highScore = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            highScore.add(sc.nextInt());
        }
        for(int i=1;i<=k;i++){
            Integer peek = highScore.poll();
            if(i==k)
                System.out.println(peek);
        }
    }
}