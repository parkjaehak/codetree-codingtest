import java.util.*;
import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static Stone[] stones;
    static int []dp;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        stones = new Stone[N];
        dp = new int[M + 1];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());

            stones[i] = new Stone(weight, value);
        }

        //무게의 합이 M을 넘지 않으면서 가치를 최대화해야함
        //dp[i] 무게 i를 초과하지 않는 최대 가치
        dp[0] = 0;

        for(int i = 0; i < N; i++){
            int cw = stones[i].weight;
            int cv = stones[i].value;

            for(int j = M; j >= cw; j--){
                dp[j] = Math.max(dp[j], dp[j - cw] + cv);
            }
        }
        System.out.print(dp[M]);
    }

    static class Stone{

        int weight, value;
        
        Stone(int weight, int value){
            this.weight = weight;
            this.value = value;
        }
    }
}