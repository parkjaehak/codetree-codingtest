import java.util.Scanner;
public class Main {
    static char[][] grid;
    static int result;
    static int R, C;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        grid = new char[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        result = 0;
        process(0, 0, 0);
        System.out.print(result);
    }

    static void process(int y, int x, int count) {
       
            if (count == 2) {
        
                result++;
                return;
            }
     
    

        char curr = grid[y][x];

        for (int dy = 1; y + dy < R - 1; dy++) {
            for (int dx = 1; x + dx < C - 1; dx++) {
                int ny = y + dy;
                int nx = x + dx;
                if (grid[ny][nx] != grid[y][x]) {
                    process(ny, nx, count + 1);
                 
                }
            }
        }
    }
}
