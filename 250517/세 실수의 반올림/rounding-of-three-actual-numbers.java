import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        double a, b, c;

        // 입력
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        // 출력
        System.out.printf("%.3f\n%.3f\n%.3f", a, b, c);
    }
}
