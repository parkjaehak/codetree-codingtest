import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        // Please write your code here.

        //정사각형을 만들자
        int minX = Math.min(x1, a1);
        int maxX = Math.max(x2, a2);

        int minY = Math.min(y1, b1);
        int maxY = Math.max(y2, b2);

        int distX = maxX - minX;
        int distY = maxY - minY;

        int line = Math.max(distX, distY);
        System.out.print(line * line);
    }
}