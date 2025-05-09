import java.util.Scanner;

public class Main {
    static int []dy = {-1, 0, 1, 0};
    static int []dx = {0,1,0,-1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [][] array = new int[n][n];
        // Please write your code here.

        int x = n / 2, y = n / 2;
        int dir = 1;
        array[x][y] = 1;
        int step = 1;

        for(int i = 2; i <= n * n; i++){
            for(int j = 0; j < step; j++){
                int ny = y + dy[dir];
                int nx = x + dx[dir];
                


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