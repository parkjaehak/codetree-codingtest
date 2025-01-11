import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static ArrayList<int[]>infos = new ArrayList<>();
    static int [][][]dp; // n번째 학생까지 파악했을때 s명의 축구와 b명의 야구로 할당시 능력의 최대합
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.

        //3가지 케이스
        //n번째 학생을 축구
        //dp[n][s][b] = dp[n-1][s-1][b] + 축구능력
        //n번째 학생을 야구
        //dp[n][s][b-1] = dp[n-1][s][b-1] + 야구능력

        //n번째 학생을 선택하지 않음
       // dp[n][s][b] = dp[n-1][s][b]

        N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int soccer = Integer.parseInt(st.nextToken());
            int baseball = Integer.parseInt(st.nextToken());

            infos.add(new int[]{soccer,baseball});
        }

        dp = new int[N + 1][12][10];

        for(int i = 1; i <= N; i++){
            int []curr = infos.get(i -1);
            int s = curr[0];
            int b = curr[1];

            for(int j = 0; j <=11; j++){
                for(int k = 0; k <= 9; k++){
                    dp[i][j][k] = dp[i-1][j][k];

                    if(j > 0){
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i-1][j-1][k] + s);
                    }

                    if (k > 0) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j][k - 1] + b);
                    }
                }
            }
        }


         System.out.println(dp[N][11][9]);

    }
}