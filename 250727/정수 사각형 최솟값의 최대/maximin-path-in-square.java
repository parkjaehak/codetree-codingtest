import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        int [][]dp = new int[n][n];
        dp[0][0] = matrix[0][0]; //경로 상 최솟값 중 가장 큰 값을 저장 

        //행
        for(int j = 1; j < n; j++){
            dp[0][j] = Math.min(dp[0][j - 1], matrix[0][j]);
        }

        for(int i = 1; i < n; i++){
            dp[i][0] = Math.min(dp[i - 1][0], matrix[i][0]);
        }

        for(int i = 1; i< n;i++){
            for(int j = 1; j < n; j++){
                int fromTop = Math.min(dp[i-1][j], matrix[i][j]);
                int fromLeft = Math.min(dp[i][j- 1], matrix[i][j]);
                dp[i][j] = Math.max(fromTop, fromLeft);
            }
        }
      
        System.out.print(dp[n-1][n-1]);
    }
}