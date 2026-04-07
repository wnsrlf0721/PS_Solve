import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 1;
        for(int i=2;i*i<=num;i++){
            result+=1;
        }
        System.out.println(result);
    }
}