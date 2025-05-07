import java.util.Scanner;
public class Main {
    static int []dy = {-1, 0, 1, 0};
    static int []dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
           
                int count = 0;
                for(int k = 0; k < 4; k++){
                    int ny = i + dy[k];
                    int nx = j + dx[k];

                    if(ny < 0 || nx < 0 || ny >= n || nx >= n || arr[ny][nx] == 0){
                        continue;
                    }
                    count++;
                }

                if(count >= 3){
                    result++;
                }
            }
        }

        System.out.print(result);

    }
}