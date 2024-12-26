import java.util.*;

public class Main {
    static int[]dp;
    static int N;
    static Scanner sc = new Scanner(System.in);
    static final int MOD = 10007;

    public static void main(String[] args) {
        N = sc.nextInt();
        dp = new int[N + 1];

        //2XN 크기
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 3;

        // 맨 뒤가 2x1
        // 맨 뒤부터 두개가 1x2, 2x2
        //n - 1 사각형에 세로 사각형 1개를 붙이는 방식과
        //n - 2 사각형에 정사각형 1개 또는 가로 사각형 2개를 붙이는 방식

        for(int i = 3; i <= N; i++){
            dp[i] = (2*dp[i-2] + dp[i-1]) % MOD;
        }

        System.out.println(dp[N]);
    }
}