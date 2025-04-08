import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        double avg = (a + b) / 2.0; //실수로 나누어야 한다

        System.out.printf("%d %.1f", sum, avg);
    }
}