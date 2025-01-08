import java.util.*;
import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, K;
    static int [][]dp; //i번째 수까지 고려했을때 음수가 j번 나타났을때 연속합 중 최댓값
    static int []array;


    public static void main(String[] args) throws Exception{
       
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
       
        dp = new int[N + 1][K + 1];
        array = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MIN_VALUE;

        for(int i = 1; i <= N; i++){
            int num = array[i]; //현재 값

            if(num >= 0){
                //양수인 경우
                for(int j = 0; j <= K; j++){
                    dp[i][j] = Math.max(dp[i - 1][j] + num, dp[i][j]);
                    ans = Math.max(ans, dp[i][j]);
                }
            }else{
            // 최대 k개 까지만 음수가 나타날 수 있게 관리합니다.
                for (int j = 1; j <= K; j++) {
                    dp[i][j] = Math.max(dp[i - 1][j - 1] + num, dp[i][j]);
                    ans = Math.max(ans, dp[i][j]);
                }
            }

        }
      System.out.println(ans);
    }
}