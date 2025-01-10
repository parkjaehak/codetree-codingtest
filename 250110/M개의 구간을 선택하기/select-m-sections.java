import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int [][]dp;
    static int [][]sum;
    static int []array;

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
        //dp[i][j] = i번째까지 고려하여 j 개의 구간을 선택했을때 최대 합\


        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N + 1][M + 1];
        sum = new int[N + 1][N  + 1];

        for(int i = 1; i <= N; i++){
            for(int j = i; j <=N; j++){
                sum[i][j] = sum[i][j - 1] + array[j]; //i부터 j까지의 부분합
            }
        }

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                dp[i][j] = -500_000_000;;
            }
        }

        dp[0][0] = 0;


        for (int j = 1; j <= M; j++) { // j개의 구간 선택
            for (int i = 1; i <= N; i++) { // i번째까지 고려
                dp[i][j] = dp[i - 1][j]; // 구간을 선택하지 않는 경우
                for (int k = 1; k <= i; k++) { // k에서 i까지 구간을 선택
                    if (k >= 2) {
                        dp[i][j] = Math.max(dp[i][j], dp[k - 2][j - 1] + sum[k][i]);
                    } else if (j == 1) { // 첫 구간 선택
                        dp[i][j] = Math.max(dp[i][j], sum[k][i]);
                    }
                }
            }
        }

        System.out.print(dp[N][M]);
    }
}