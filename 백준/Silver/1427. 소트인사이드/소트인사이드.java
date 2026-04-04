import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digitArr = new int[10];
        while(num!=0){
            int tgt = num%10;
            digitArr[tgt]++;
            num/=10;
        }
        for(int idx=9;idx>=0;idx--){
            for(int i=0;i<digitArr[idx];i++){
                System.out.print(idx);
            }
        }
    }
}