import java.util.Scanner;

public class Main {

    static int []dy = {-1, 0, 1, 0};
    static int []dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;
        char D = sc.next().charAt(0);

        // Please write your code here.

        int [][] array = new int[N][N];

        int dir = 0;
        if(D == 'U'){
            dir = 0;
        }else if(D == 'R'){
            dir = 1;
        }else if(D == 'D'){
            dir = 2;
        }else if(D == 'L'){
            dir = 3;
        }

        int cy = R, cx = C;

        for(int t = 0; t < T; t++){
            //갈 수 있는지 체크
            int ny = cy + dy[dir];
            int nx = cx + dx[dir];

            if(ny < 0 || nx < 0 || ny >= N || nx >= N){
                //방향을 바꾼다
                dir = (dir + 2) % 4;
                continue;
            }
            cy = ny;
            cx = nx;
        }

        System.out.print((cy + 1) + " " + (cx + 1));
    }
}