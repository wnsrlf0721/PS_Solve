import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        for(int idx=0;idx<testCount;idx++){
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            PriorityQueue<Integer> minHeap = new PriorityQueue<>();
            int count = sc.nextInt();
            System.out.println((count+1)/2);
            for(int i=1;i<=count;i++){
                int tgt = sc.nextInt();
                if(maxHeap.size() == minHeap.size()){
                    maxHeap.add(tgt);
                }
                else{
                    minHeap.add(tgt);
                }
                if(!maxHeap.isEmpty() && !minHeap.isEmpty()){
                    int middleMin = maxHeap.peek();
                    int middleMax = minHeap.peek();

                    if(middleMin > middleMax){
                        maxHeap.poll();
                        maxHeap.add(middleMax);

                        minHeap.poll();
                        minHeap.add(middleMin);
                    }
                }

                if(i%2==1)
                    System.out.print(maxHeap.peek()+" ");
                if((i+1) % 20 == 0)
                    System.out.println();
            }
            System.out.println();
        }
    }
}