import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                matrix[i][j] = sc.nextInt();

        int[][] dp = new int[n + 2][n + 2]; // 여유 공간 확보
        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE); // 큰 값으로 초기화

        dp[1][n] = matrix[1][n]; // 시작점

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i > 1)
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + matrix[i][j]);
                if (j < n)
                    dp[i][j] = Math.min(dp[i][j], dp[i][j + 1] + matrix[i][j]);
            }
        }

        System.out.println(dp[n][1]); // 도착점
    }
}
