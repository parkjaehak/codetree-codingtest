import java.util.Scanner;

public class Main {
    static int[] dy = {-1, 0, 1, 0}; // 상우하좌
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] array = new int[n][n];

        int x = n / 2, y = n / 2;
        int dir = 1;
        int step = 1;
        int count = 1;
        array[y][x] = count++;

        // count가 n*n에 도달할 때까지 반복
        while (count <= n * n) {
            for (int repeat = 0; repeat < 2; repeat++) {
                for (int j = 0; j < step; j++) {
                    y += dy[dir];
                    x += dx[dir];

                    if (y < 0 || x < 0 || y >= n || x >= n) break;

                    array[y][x] = count++;
                }
                dir = (dir + 3) % 4; // 시계 반대 방향
            }
            step++;
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
