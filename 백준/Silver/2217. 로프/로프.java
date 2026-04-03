import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int num = Integer.parseInt(s);
        PriorityQueue<Integer> MAX_Queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int idx=0;idx<num;idx++){
            MAX_Queue.add(Integer.parseInt(br.readLine()));
        }
        int result = 0;
        for(int idx=1;idx<=num;idx++){
            result = Integer.max(result,MAX_Queue.poll()*idx);
        }
        System.out.println(result);
    }
}