import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N, M;
    static StringTokenizer st;
    static int[]array;
    static int[][]dp; //i번째 숫자까지 사용하였을 현재 합이 j인 수

    public static void main(String[] args) throws Exception {
        // 더하는 과정 속에서 값이 -20보다 작아지거나 20보다 커지면 안된다.
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = new int[N + 1];
        //숫자를 더하거나 빼서 M이 되도록 하는 가짓수
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        //dp[i][j] : i번째 숫자까지 사용하였을때 현재 합이 j인 수
        //dp[i][j]=dp[i − 1][j - a[i]]+dp[i − 1][j + a[i]] //이전까지의 합에 더하거나 빼는 경우
  
        dp = new int[N + 1][41]; // -20 ~ 20 -> 0 ~ 40

        dp[1][array[1] + 20] = 1;
        dp[1][-array[1] + 20] += 1;

        for (int i = 2; i <= N; i++) {  // i번째 숫자까지 고려
            for (int sum = -20; sum <= 20; sum++) {  // 가능한 합의 범위
                 if (dp[i - 1][sum + 20] > 0) {  // 이전 단계에서 해당 합이 존재하면
                    if (sum + array[i] <= 20) {
                        dp[i][sum + array[i] + 20] += dp[i - 1][sum + 20];
                    }
                    if (sum - array[i] >= -20) {
                        dp[i][sum - array[i] + 20] += dp[i - 1][sum + 20];
                    }
                }
            }
        }

        System.out.println(dp[N][M + 20]);

        
    }


}