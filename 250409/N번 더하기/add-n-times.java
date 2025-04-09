import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int N = sc.nextInt();

        int result = 0;
        for(int n = 0; n < N; n++){
            a += N;
            System.out.println(a);
        }
    }
}