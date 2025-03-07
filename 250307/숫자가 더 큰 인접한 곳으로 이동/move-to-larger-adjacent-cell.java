import java.util.Scanner;
import java.io.*;
public class Main {

    static int[] dy = {-1, 1 ,0, 0};
    static int[] dx = {0 ,0, -1, 1}; //상 하 좌 우
    static int n;
    static int [][]grid;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static int cy, cx;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        cy = sc.nextInt();
        cx = sc.nextInt();
        grid = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        sb.append(grid[cy][cx] + " ");
        
        while(true){
            boolean isExist = simulate();
            if(!isExist){
                break;
            }
            sb.append(grid[cy][cx] + " ");
        }
        
        bw.write(sb.toString());
        bw.flush();

    }

    static boolean simulate(){

        for(int i = 0; i < 4; i++){
           int ny = cy + dy[i];
           int nx = cx + dx[i];

           if(ny >= n || nx >= n || ny < 0 || nx < 0 ||  grid[cy][cx] >= grid[ny][nx]){
                continue;
           }
            if( grid[cy][cx] < grid[ny][nx]){
                cy = ny;
                cx = nx;
                return true;
            }
        }
        return false;
    }
}