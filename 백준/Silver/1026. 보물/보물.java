import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PriorityQueue<Integer> FirstQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int idx=0;idx<num;idx++){ // 배열 A 값
            FirstQueue.add(sc.nextInt());
        }
        PriorityQueue<Integer> SecondQueue = new PriorityQueue<>();
        for(int idx=0;idx<num;idx++){ // 배열 B 값
            SecondQueue.add(sc.nextInt());
        }

        // A 배열의 우선순위 값 (최대값) * B 배열의 우선순위 값 (최소값) -> S의 최소값
        int result = 0;
        for(int idx=0;idx<num;idx++){
            result += FirstQueue.poll() * SecondQueue.poll();
        }
        System.out.println(result);
    }
}