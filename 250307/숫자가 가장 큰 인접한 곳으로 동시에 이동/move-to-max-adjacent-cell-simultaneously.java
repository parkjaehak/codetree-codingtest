import java.util.Scanner;
import java.util.Arrays;
public class Main {

    static int n,m,t;
    static int []dy = {-1, 1, 0, 0};//상하좌우
    static int[]dx = {0, 0, -1, 1};
    static int [][] grid;
    static int [][] count;
    static int [][] marbles;
  


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();

        grid = new int[n][n];
        count = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        marbles = new int[m][2];
        for (int i = 0; i < m; i++) {
            marbles[i][0] = sc.nextInt();
            marbles[i][1] = sc.nextInt();
            count[marbles[i][0] - 1][marbles[i][1] - 1] = 1;
        }

        //t라는 시간동안 구슬이동을 반복한다.
        for(int time = 0; time < t; time++){
            solve();
        }

        int result = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(count[i][j] == 1){
                    result++;
                }
            }
        }
        System.out.print(result);
        
    }

    static void solve(){
        //next count 초기화
       int [][]nextCount = new int[n][n];

        for(int j = 0; j < m; j++){
            int cy = marbles[j][0];
            int cx = marbles[j][1];

            int maxnum = 0;
            int maxY = 0; int maxX = 0;

            for(int i = 0; i < 4; i++){
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if(ny < 0 || nx < 0 || ny >= n || nx >= n){
                    continue;
                }
                if(grid[ny][nx] > maxnum){
                    maxnum = grid[ny][nx];
                    maxY = ny;
                    maxX = nx;
                    
                }
            }   
            //next count 내 구슬의 위치에 1을 증가시킨다.
            nextCount[maxY][maxX] += 1; 
          
            marbles[j][0] = maxY;
            marbles[j][1] = maxX;

        }

        //nextCount 값을 Count 배열로 복사한다.
        for (int i = 0; i < nextCount.length; i++) {
            count[i] = Arrays.copyOf(nextCount[i], nextCount[i].length);
        }
        //2이상인 값들을 0으로바꾼다.
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(count[i][j] == 2){
                    count[i][j] = 0;
                }
            }
        }

    }
}