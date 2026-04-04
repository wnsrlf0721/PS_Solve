import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<loop;i++){
            pq.add(Integer.parseInt(br.readLine()));
        }
        long result = 0;
        while(!pq.isEmpty()){
            if(pq.size()==1){
                System.out.println(result);
                return;
            }
            int m1 = pq.poll();
            int m2 = pq.poll();
            result += (m1+m2);
            pq.add(m1+m2);
        }
    }
}