import java.util.*;
import java.io.*;

public class Main {
    static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static List<int[]> infos = new ArrayList<>();
    static int [][]dp;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            infos.add(new int[]{l, m, r});
        }

        //dp[i][j]: i층에서 j번째 방을 선택했을때 얻을 수 있는 최대 개수

        //dp[i][0] = max(dp[i-1][1], dp[i-1][2]) + l
        //dp[i][1] = max(dp[i-1][0], dp[i-1][2]) + m
        //dp[i][2] = max(dp[i-1][0], dp[i-1][1]) + r

        dp = new int[N + 1][3];
        int[]curr = infos.get(0); //1층
        dp[1][0] = curr[0];
        dp[1][1] = curr[1];
        dp[1][2] = curr[2];
        

        for(int i = 1; i < N; i++){ 
            int[]info = infos.get(i); //1부터 n-1까지
            int cl = info[0];
            int cm = info[1];
            int cr = info[2];
            
            dp[i + 1][0] = Math.max(dp[i][1], dp[i][2]) + cl;
            dp[i + 1][1] = Math.max(dp[i][0], dp[i][2]) + cm;
            dp[i + 1][2] = Math.max(dp[i][0], dp[i][1]) + cr;

        }

        System.out.print(Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2])));


    }
}