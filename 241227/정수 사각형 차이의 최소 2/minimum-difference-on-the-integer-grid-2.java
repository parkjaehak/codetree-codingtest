import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][]array;
    static int[][]dp;
    static int N;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        array = new int[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp = new int[N][N];
        //최솟값을 정하고 그 이상의 수의 칸만을 이동
        //이떄 최대 - 최소를 최소화해야한다.

        for(int low = 1; low <= N; low++){
            int high = solve(low); 

            if(high == Integer.MAX_VALUE){
                // 더 이상 이동이 불가능하다
                continue;
            }
            answer = Math.min(answer, high - low);
        }    
        System.out.print(answer);
    }

    static int solve(int low){
        //low 미만인 값은 사용할 수 없도록 한다.
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(array[i][j] < low){ //자정한 최솟값이하는 선택하지 않도록 한다.
                    array[i][j] = Integer.MAX_VALUE; // 최댓값으로 초기화
                }
            }
        }
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                dp[i][j] = Integer.MAX_VALUE; //dp는 모두 최댓값으로 초기화

        dp[0][0] = array[0][0]; //초기값 설정

        for(int i = 1; i < N; i++){
            dp[i][0] = Math.max(dp[i - 1][0], array[i][0]); //시작점 기준으로 비교하여 열 초기화
            dp[0][i] = Math.max(dp[0][i - 1], array[0][i]); //행 초기화
        }

        for(int i = 1; i < N; i++){
            for(int j = 1; j < N; j++){
                //위 값과 왼쪽 값 중 작은 값 vs 해당 위의 값 -> 최댓값
                dp[i][j] = Math.max(Math.min(dp[i-1][j], dp[i][j-1]), array[i][j]);
            }
        }
        return dp[N-1][N-1];
        //dp[i][j]는 (i, j)에 도달하기 위한 경로에서의 최댓값
    }
}