import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][]array;
    static int[][]dp;
    static int N, M;

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = new int[N][M];
        dp = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = Integer.MIN_VALUE;
            }
        }


        //밟을 수 있는 칸의 최대 수 구하기
        //이동은 점프를 통해서 점프 시 현재 위치 수보다 더 커야한다.
        dp[0][0] = 1; //시작위치에서는 1칸을 밟는다.

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                //바로 직전의 위치는 k,l

                for(int k = 0; k < i; k++){
                    for(int l = 0; l < j; l++){
                        if(dp[k][l] == Integer.MIN_VALUE){
                            continue;
                        }

                        if(array[k][l] < array[i][j]){
                            dp[i][j] = Math.max(dp[i][j], dp[k][l] + 1);
                        }
                    }
                }
            }
        }

        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                answer = Math.max(answer, dp[i][j]);
            }
        }
        System.out.print(answer);
    }
}