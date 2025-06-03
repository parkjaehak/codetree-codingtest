import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close(); // Scanner 닫기

        // X에서 Y까지의 수
        int sum = 0;
        for (int i = x; i <= y; i++) {
            int d1 = (i / 10000) % 10; // 만의 자리
            int d2 = (i / 1000) % 10;  // 천의 자리
            int d3 = (i / 100) % 10;   // 백의 자리
            int d4 = (i / 10) % 10;    // 십의 자리
            int d5 = i % 10;           // 일의 자리

            sum = Math.max(d1 + d2 + d3 + d4 + d5, sum);
        }
        System.out.print(sum);
    }
}
