import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> plusArr = new PriorityQueue<>(); //값이 작은 순서대로
        PriorityQueue<Integer> minusArr = new PriorityQueue<>(Collections.reverseOrder()); // 값이 큰 순서대로(음수)
        for(int i=0;i<loop;i++){
            int tgt = Integer.parseInt(br.readLine());
            if(tgt == 0){
                calculate(plusArr,minusArr);
            }
            else{
                if(tgt > 0)
                    plusArr.add(tgt);
                else
                    minusArr.add(tgt);
            }
        }
    }

    public static void calculate(PriorityQueue<Integer> plus, PriorityQueue<Integer> minus){
        Integer plusVal = plus.peek();
        Integer minusVal = minus.peek();
        if(plusVal == null || minusVal == null){
            if(plusVal == null && minusVal == null)
                System.out.println(0);
            else if(plusVal == null)
                System.out.println(minus.poll());
            else
                System.out.println(plus.poll());
        }
        else{
            if(plusVal > -minusVal)
                System.out.println(minus.poll());
            else if (plusVal < -minusVal)
                System.out.println(plus.poll());
            else
                System.out.println(minus.poll());

        }
    }
}