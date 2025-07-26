import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        int [][]dp = new int[101][101];

        //오른쪽 혹은 아래로만 이동

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                 dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + matrix[i][j];
            }

        }

        System.out.print(dp[n][n]);
    }
}