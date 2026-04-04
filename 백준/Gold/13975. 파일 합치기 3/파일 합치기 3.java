import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        PriorityQueue<Long> costQueue = new PriorityQueue<>();
        for(int i=0;i<loop;i++){
            int size = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int ii=0;ii<size;ii++)
                costQueue.add(Long.parseLong(st.nextToken()));
            long result = 0;
            while(!costQueue.isEmpty()){
                if(costQueue.size()>1){
                    long first = costQueue.poll();
                    long second = costQueue.poll();
                    costQueue.add(first+second);
                    result += (first+second);
                }
                else{
                    costQueue.poll();
                    System.out.println(result);
                }
            }
        }

    }
}