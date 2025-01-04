import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int []first;
    static int[]second;
    static StringTokenizer st;
    static int [][]dp;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        first = new int[N + 1];
        second = new int[N + 1];
        dp = new int[N + 1][N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            first[i] = Integer.parseInt(st.nextToken());    
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            second[i] = Integer.parseInt(st.nextToken());    
        }


        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }

        //두번째 플레이어가 얻을 수 있는 최대 점수
        //dp[i][j]: 첫번째 선수가 i번째 카드까지, 두번째 선수가 j번째 카드까지 버렸을때 두번째 선수가 얻을 수 있는 최대점수
        dp[0][0] = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){

                if(dp[i][j] == -1){
                    //얻을 수 있는 점수가 없으면 넘긴다.
                    continue;
                }

                //첫번재 플레이어의 카드가 더 작은 경우
                if(first[i + 1] < second[j + 1]){
                    //첫번째 카드를 버리고 두번째 선수는 점수를 얻지 못한다.
                    dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j]);
                }

                //두번째 플레이어의 카드가 더 작은 경우
                if(first[i + 1] > second[j + 1]){
                    //두번째 플레이어가 점수를 획득한다.
                    dp[i][j + 1] = Math.max(dp[i][j + 1], dp[i][j] + second[j + 1]);
                }

                //카드 버리기
                dp[i + 1][j + 1] = Math.max(dp[i+1][j+1], dp[i][j]);
            }
        }


        int result = 0;
        for(int i = 0; i <= N; i++){
            result  = Math.max(result, dp[i][N]); //게임에서 카드가 모두 소진될때 그 점수를 확인한다.
            result = Math.max(result, dp[N][i]);
        }
        System.out.print(result);
    }
}