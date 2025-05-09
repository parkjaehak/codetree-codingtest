import java.util.Scanner;

public class Main {
    static int []dy = {-1, 0, 1, 0};
    static int []dx = {0,1,0,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] array = new int[n][n];
        // Please write your code here.

        int x = n - 1, y = n - 1;
        int dir = 3;
        array[n - 1][n - 1] = n * n;

        for(int i = n*n - 1; i >= 1; i--){

            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if(ny < 0 || nx < 0 || ny >= n || nx >= n || array[ny][nx] != 0){
                dir = (dir + 1) % 4;
            }

            y = y + dy[dir];
            x = x + dx[dir];
            array[y][x] = i;
        }

         for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}