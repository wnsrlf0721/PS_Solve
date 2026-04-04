import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            pq.add(num);
            avg+=num;
        }
        avg/=5;
        pq.poll();
        pq.poll();
        Integer middle = pq.poll();
        System.out.println(avg);
        System.out.println(middle);

    }
}