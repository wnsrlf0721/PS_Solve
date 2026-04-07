import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        for(int i=0;i<loop;i++){
            long target = Long.parseLong(br.readLine());
            target = Long.max(target,2);
            while(true){
                boolean isPrime = true;
                for(long idx = 2; idx*idx<=target;idx++){
                    if(target%idx == 0) {
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(target);
                    break;
                }
                target++;
            }
        }
    }
}