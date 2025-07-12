import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.

        //순간이동을 사용하지 않고 A에서 B까지 그냥 걷는 경우.

        //순간이동을 한 번 사용하는 경우:
        //1. A에서 x까지 걷고, x에서 y로 순간이동한 뒤 y에서 B까지 걷는 경우.
        //2. A에서 y까지 걷고, y에서 x로 순간이동한 뒤 x에서 B까지 걷는 경우.

        int dist1 = Math.abs(A - B);
        int dist2 = Math.abs(A - x) + Math.abs(B - y);
        int dist3 = Math.abs(A - y) + Math.abs(B - x);

        int result = Math.min(dist1, Math.min(dist2, dist3));

        System.out.print(result);
    }
}