import java.util.*;

public class Main {
    static int N;
    static Scanner sc = new Scanner(System.in);
    static int [][][]dp;
    static int MOD = 10^9 + 7;


    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        //dp[i][t][b]: i길이 문자열에서 T가 t개이고 마지막 연속 B가 b일때 만들 수 있는 문자열 가짓수
        //B 연속 세번, T 총합 세번

        N = sc.nextInt();
        //i번쨰에 총 세가지 경우가 있음
        dp = new int[N + 1][3][3];

        dp[1][0][0] = 1; //G
        dp[1][1][0] = 1; //T
        dp[1][0][1] = 1; //B

        for(int i = 2; i <= N; i++){
            for(int t = 0; t < 3; t++){
                for(int b = 0; b < 3; b++){
                    //G를 추가하는 경우
                    dp[i][t][0] = (dp[i][t][0] + dp[i - 1][t][b]) % MOD;

                    //B를 추가하는 경우
                    if(b + 1 < 3){
                        dp[i][t][b + 1] = (dp[i][t][b + 1] + dp[i - 1][t][b]) % MOD;
                    }

                    //T 추가하는 경우
                    if(t + 1 < 3){
                        dp[i][t + 1][0] =  (dp[i][t + 1][0] + dp[i - 1][t][b]) % MOD;
                    }
                }
            }
        }

         // 결과 계산
        int result = 0;
        for (int t = 0; t < 3; t++) {
            for (int b = 0; b < 3; b++) {
                result = (result + dp[N][t][b]) % MOD;
            }
        }

        System.out.print(result);

    }
}