import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] pathArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] priceArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int curPrice = priceArr[0];
        long total = 0;
        for (int i = 0; i < num-1; i++) {
            // 현재 주유소의 가격이 지금까지의 최소 가격보다 싸다면 갱신
            if (priceArr[i] < curPrice) {
                curPrice = priceArr[i];
            }

            // (최저가 * 다음 도시까지의 거리)를 총 비용에 합산
            // 계산 시 형변환(casting)을 통해 오버플로우 방지
            total += (long) curPrice * pathArr[i];
        }
        System.out.println(total);
    }
}