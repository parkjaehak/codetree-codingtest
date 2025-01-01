import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M;
    static int []dp;
    static StringTokenizer st;
    static int []coins;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //동전 종류
        M = Integer.parseInt(st.nextToken()); //기준금액
        dp = new int[M+1]; //금액이 M일떄의 최대 동전의 수
        Arrays.fill(dp, -1); // 초기값: 만들 수 없는 상태
        coins = new int[N];

        st = new StringTokenizer(br.readLine()); 
        for(int i = 0; i < N; i++){
            coins[i] = Integer.parseInt(st.nextToken()); //동전 금액을 저장한다.
        }

        dp[0] = 0;
        
        for(int n =0; n < coins.length;  n++){
            int coin = coins[n];
            for(int m = coin; m <= M; m++){
                if(dp[m - coin] != -1){
                    dp[m] = Math.max(dp[m], dp[m-coin]+ 1); //최대 동전의 수를 구한다.
                }
            }
        }

        System.out.println(dp[M]);

    }
}