import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
          int c = sc.nextInt();

          int sum = a + b + c;
          int avg = sum / 3;
          int r = sum - avg;

          System.out.print(sum + "\n" + avg + "\n" + r);
    }
}