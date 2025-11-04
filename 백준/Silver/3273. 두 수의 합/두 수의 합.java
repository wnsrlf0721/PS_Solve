import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        // time limit == 1sec == 10^8
        int number = key.nextInt(); // <=10^5
        int[] arr = new int[1000000]; // array 크기 10^6
        for(int i=0;i<number;i++){
            arr[key.nextInt()-1] += 1;
        }
        int target = key.nextInt();
        int result = 0;
        for(int i=0;i<target/2;i++){ // target == 13 -> 6 , 14 -> 7
            if(target-2-i>=1000000)
                continue;
            if(i==target-2-i)
                continue;
            if(arr[i]==1 && arr[target-2-i]==1){
                result +=1;
            }
        }
        System.out.println(result);
    }
}