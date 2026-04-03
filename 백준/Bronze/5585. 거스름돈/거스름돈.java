import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {500,100,50,10,5,1};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = 1000-num;
        int result =0;
        for(int tgt: arr){
            int idx = num / tgt;
            result += idx;
            num -= tgt*idx;
        }
        System.out.println(result);
    }
}