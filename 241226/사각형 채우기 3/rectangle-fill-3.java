import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static long[]dp;
    public static final int MOD = 1000000007;

    
    public static void main(String[] args) {
        int N = sc.nextInt();    
        dp = new long[N + 1];
        
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i <= N; i++){
            dp[i] = (dp[i-1] * 2 + dp[i-2] * 3) % MOD;
            for(int j = i -3; j >=0; j--){
                dp[i] = (dp[i] + dp[j] * 2) % MOD;
            }
        }
        System.out.println(dp[N]);

        //i-1 : 2 X dp[i-1]
        //i-2: 3 X dp[i-2]
        //i-3: 2 x dp[i-3]
        //i-4: 2 x dp[i-4] ...
        //dp[0] = 1, dp[1] = 2
        //dp[i] = 2*dp[i-1] + 3*dp[i-2] + 2*(dp[i-3] + dp[i-4] + ... + dp[1] + dp[0])

    }
}