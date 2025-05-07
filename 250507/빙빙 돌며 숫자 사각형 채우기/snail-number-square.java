import java.util.Scanner;
public class Main {

    static int [] dy = {-1, 0, 1, 0};
    static int [] dx = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.


        int [][] array = new int[n][m];
        int dir = 1; //오른쪽
        int x = 0, y = 0;
        array[0][0] = 1;
        for(int i = 2; i <= n * m; i++){

            int ny = y + dy[dir];
            int nx = x + dx[dir];

            if(ny < 0 || nx < 0 || ny >= n || nx >= m || array[ny][nx] != 0){
                //벽을 만난거나 방문하지 않은 곳이라면
                //90도 회전한다
                dir = (dir + 1) % 4;
            }
            y = y + dy[dir];
            x = x + dx[dir];
            array[y][x] = i;
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}