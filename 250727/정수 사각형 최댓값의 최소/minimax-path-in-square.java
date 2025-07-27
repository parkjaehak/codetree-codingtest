import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[100][100];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int [][]dp = new int[100][100];
        //최댓값을 최소로
        dp[0][0] = matrix[0][0];

        for(int i = 1; i < n; i++){
            dp[i][0] = Math.max(dp[i - 1][0], matrix[i][0]);
            dp[0][i] = Math.max(dp[0][i - 1], matrix[0][i]);
        }

        //위, 좌 값 중 작은 값
        //해당 위치 값 중 최댓값

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = Math.max(Math.min(dp[i - 1][j], dp[i][j - 1]), matrix[i][j]);

            }


        }

        System.out.print(dp[n-1][n-1]);

    }
}