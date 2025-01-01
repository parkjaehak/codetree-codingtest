import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static boolean []dp;
    static int []A;

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); //총 수열의 개수
        M = Integer.parseInt(st.nextToken()); //만들어야하는 수(합)

        dp = new boolean[M + 1]; // i라는 수가 만들어질때의 부분수열의 존재 여부
        dp[0] = true; // 합이 0인 부분 수열은 항상 존재

        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < A.length; i++){
            int curr = A[i];
            for(int j = M; j >= curr; j--){
                if(dp[j - curr]){ // 5를 만드려면 수열의 원소 5가 필요하다.
                    dp[j] = true;
                }
            }
        }

        if(dp[M]){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

        
    }
}