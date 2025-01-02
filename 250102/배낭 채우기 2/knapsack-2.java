import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int[]dp;
    static List<int[]> infos = new ArrayList<>();

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dp = new int[M + 1]; //무게가 i일때 최대 가치

    
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            infos.add(new int[]{w,v});
        }

        dp[0] = 0;

        for(int i = 0; i < N; i++){
            int cw = infos.get(i)[0];
            int cv = infos.get(i)[1];

            for(int j = cw; j <= M; j++){
                dp[j] = Math.max(dp[j], dp[j - cw] + cv);
            }
        }
        System.out.print(dp[M]);
    }
}