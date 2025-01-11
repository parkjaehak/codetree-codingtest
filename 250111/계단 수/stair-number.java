import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int [][]dp;
    static final int MOD = (int) 1e9 + 7;


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        
        N = sc.nextInt();

        //dp[i][j]: 길이가 i이고 마지막 수가 j인 계단 수 개수
        dp = new int[N+1][10];
        //끝자리가 j일 경우 이전 자리에서 j-1 or j+1: 계단수
        for(int j = 1; j <=9; j++){
            dp[1][j] = 1; //0은 제외 (0으로 시작하는 문자열은 수로 보지 않기 떄문)
        }

        for(int i = 2; i <=N; i++){
            for(int j = 0; j <= 9; j++){
                if(j > 0){
                    dp[i][j] = (dp[i][j] + dp[i-1][j-1])%MOD;
                }
                if(j < 9){
                     dp[i][j] = (dp[i][j] + dp[i-1][j+1])%MOD;
                }
            }
        }


        int result = 0;
        for (int j = 0; j <= 9; j++) {
            result = (result + dp[N][j]) % MOD;
        }

        System.out.println(result);
        

    }
}