import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        //점프는 한칸 이상 오른쪽, 한칸 이상 아래쪽으로 + 해당 칸 수가 더 커야한다


        int[][]dp = new int[n][m];
        //n,m칸에 도착했을때 경로 중 밟을 수 있는 칸의 최대

        dp[0][0] = 1;
        //시작위치 ㅓㅇ의

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){

                for(int k = 0; k < i; k++){
                    for(int l = 0; l < j; l++){

                        //k, l에 도달하지 못하는 경우는 패스한다.
                        if(dp[k][l] == 0){
                            continue;
                        }

                        //값이 증가하는 경우에만 갱신한다.
                        if(grid[k][l] < grid[i][j]){
                            dp[i][j] = Math.max(dp[i][j], dp[k][l] + 1);
                        }
                    }
                }
            }
        }

        
        int answer = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                answer = Math.max(answer, dp[i][j]);
            }
        }

        System.out.print(answer);
        



    }
}