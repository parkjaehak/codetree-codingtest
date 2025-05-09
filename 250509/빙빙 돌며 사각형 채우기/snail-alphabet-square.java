import java.util.Scanner;
public class Main {
    static int []dy = {-1, 0, 1, 0};
    static int []dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        char[][] array = new char[n][m];

        int x = 0, y = 0;
        int dir = 1;
        array[0][0] = 'A';

        for(int i = 1; i < n * m; i++){

            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if(ny < 0 || nx < 0 || ny >= n || nx >= m || array[ny][nx] != 0){
                dir = (dir + 1) % 4;
            }

            char ch = (char) ('A' + (i % 26));
            y = y + dy[dir];
            x = x + dx[dir];

            array[y][x] = ch;

        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}