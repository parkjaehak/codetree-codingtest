import java.util.Scanner;
public class Main {
    static int[] dy = {-1, -1, 0, 1, 1, 1, 0, -1}; // 북, 북동, 동, 남동, 남, 남서, 서, 북서
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < m; j++){
                arr[i][j] = s.charAt(j);
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {  
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 'L') {
                    for (int k = 0; k < 8; k++) {
                        int ny1 = i + dy[k];
                        int nx1 = j + dx[k];
                        int ny2 = i + 2 * dy[k];
                        int nx2 = j + 2 * dx[k];

                        if (ny2 >= 0 && nx2 >= 0 && ny2 < n && nx2 < m) {
                            if (arr[ny1][nx1] == 'E' && arr[ny2][nx2] == 'E') {
                                result++;
                            }
                        }
                    }
                }
            }
        }

        System.out.print(result);
    }
}
