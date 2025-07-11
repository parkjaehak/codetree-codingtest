import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        int time = 0;
        int k = 1;

        while (true) {
            if (X <= k * k) {
                // 거리 X가 k^2 이하이면
                time = 2 * k - 1;
                break;
            } else if (X <= k * k + k) {
                // 거리 X가 k^2와 k^2 + k 사이면
                time = 2 * k;
                break;
            }
            k++;
        }

        System.out.println(time);
    }
}
