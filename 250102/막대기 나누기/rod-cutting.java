import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[]dp;
    static int[] prices;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        //길이가 i인 막대기를 팔아 얻을 수 있는 최대 수익
        dp = new int[N + 1];

        prices = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            prices[i] = Integer.parseInt(st.nextToken()); 
        }

        dp[0] = 0;

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] = Math.max(dp[i], prices[j] + dp[i - j]);
            }
        }

        System.out.print(dp[N]);

    }
}