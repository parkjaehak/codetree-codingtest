import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int []dp;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        //더해지는 순서가 다르면 다른 조합
        //n을 1,2,5의 합으로 나타내는 방법의 수
        dp = new int[N + 1];
        dp[0] = 1; //아무것도 선택하지 않는 경우

        //dp[i] = dp[i-1] + dp[i - 2] + dp[i - 5]
        //현재 정수 i일때는 i-1번째, i-2번쨰, i-5번쨰 dp의 합이다

        for(int i = 1; i <= N; i++){
            dp[i] += dp[i - 1];
            if(i >= 2){
                dp[i] += dp[i - 2];
            }
            if(i >= 5){
                dp[i] += dp[i -5 ];
            }
            dp[i] %= 10007;
        }
        System.out.print(dp[N]);

    }
}