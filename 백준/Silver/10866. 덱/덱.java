import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int iterNum = Integer.parseInt(input);
        for(int i=0;i<iterNum;i++){
            input = br.readLine();
            String[] arr = input.split(" ");
            if(arr[0].startsWith("push")){
                int num = Integer.parseInt(arr[1]);
                if(arr[0].endsWith("front")){
                    ad.addFirst(num);
                }
                else{
                    ad.addLast(num);
                }
            }
            else{
                int pop = 0;
                switch (arr[0]){
                    case "size":
                        System.out.println(ad.size());
                        break;
                    case "empty":
                        System.out.println(ad.isEmpty() ? 1: 0);
                        break;
                    case "front":
                        if(ad.isEmpty())
                            System.out.println(-1);
                        else
                            System.out.println(ad.getFirst());
                        break;
                    case "back":
                        if(ad.isEmpty())
                            System.out.println(-1);
                        else
                            System.out.println(ad.getLast());
                        break;
                    case "pop_back":
                        if(ad.isEmpty())
                            System.out.println(-1);
                        else
                            System.out.println(ad.pollLast());
                        break;
                    case "pop_front":
                        if(ad.isEmpty())
                            System.out.println(-1);
                        else
                            System.out.println(ad.pollFirst());
                        break;
                }
            }
        }
    }
}