import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[100][100];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int[][]dp = new int[100][100];
        int answer = Integer.MAX_VALUE;

       //최댓값과 최솟값의 차이를 가장 적게 만드는 경로

       //최솟값을 일일이 가정하며 최솟값 이상의 수들만 써서 이동하자
       //경로상 놓여있는 수들 중 최댓값을 최소화 하자

       for(int lowerBound = 1; lowerBound <= 100; lowerBound++){
            int upperBound = Integer.MAX_VALUE;


            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    //i 미만 값은 사용할 수 없도록 gird 변경
                    if(grid[j][k] < lowerBound){
                        grid[j][k] = Integer.MAX_VALUE;
                    }
                }
            }


            //DP 초기화
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    dp[j][k] = Integer.MAX_VALUE;
                }
            }

            dp[0][0] = grid[0][0];

            for(int j = 1; j < n; j++){
                dp[j][0] = Math.max(dp[j - 1][0], grid[j][0]);
            }

            for(int j = 1; j < n; j++){
                dp[0][j] = Math.max(dp[0][j - 1], grid[0][j]);
            }


            //탐색 위치의 top, left 값 중 작은 값
            //해당 위치 숫자 중 최댓값을 구한다.

            for(int j = 1; j < n; j++){
                for(int k = 1; k < n; k++){
                    dp[j][k] = Math.max(Math.min(dp[j - 1][k], dp[j][k - 1]), grid[j][k]);
                }
            }

            upperBound = dp[n - 1][n - 1];

            if(upperBound == Integer.MAX_VALUE){
                //이동이 불가능한 경우
                continue;
            }

            answer = Math.min(answer, upperBound - lowerBound);
       }

       System.out.print(answer);
    }
}