import java.util.Scanner;


public class Main {
    static int []dy = {-1, 0, 1, 0};
    static int []dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]array = new int[n][n];

        //색칠되어 있는 칸이 정확히 3칸

        for(int i = 0; i < m; i++){
            int y = sc.nextInt() - 1;
            int x = sc.nextInt() - 1;
            array[y][x] = 1;

            int count = 0;
            for(int j = 0; j < 4; j++){
                int ny = y + dy[j];
                int nx = x + dx[j];

                if(ny < 0 || nx < 0 || ny >=n || nx >= n || array[ny][nx] == 0){
                    continue;
                }
                count++;
            }
            if(count == 3){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}