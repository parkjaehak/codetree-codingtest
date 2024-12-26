import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] dp = new long[N+1];
        int MOD = (int)(1e9 + 7);
        dp[0] = 1;
        dp[1] = 2;
        long total = 0;

        for (int i = 2; i <= N; i++) {
            dp[i] = (dp[i-2] * 3 + dp[i-1] * 2 + 2 * total) % MOD;
            total = (total + dp[i-2]) % MOD;
        }
        
        System.out.println(dp[N]);
    }
}