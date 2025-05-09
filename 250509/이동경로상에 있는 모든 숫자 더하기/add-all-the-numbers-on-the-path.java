import java.util.Scanner;

public class Main {
    static int []dy = {-1, 0, 1, 0};
    static int []dx = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        String commands = sc.next();
        int[][] board = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int y = n /2, x = n / 2;
        int dir = 0;

        int sum = board[n/2][n/2];

        for(int i = 0; i < commands.length(); i++){
            char c = commands.charAt(i);

            if(c == 'R'){
               dir =  (dir + 1) % 4;
            }else if(c == 'L'){
                dir = (dir  + 3) % 4;
            }else if(c == 'F'){
                int ny = y + dy[dir];
                int nx = x + dx[dir];

                if(ny < 0 || nx < 0 || ny >= n || nx >= n){
                    continue;
                }
                sum += board[ny][nx];
                y = ny;
                x = nx;
            }
        }

        System.out.print(sum);
    }
}