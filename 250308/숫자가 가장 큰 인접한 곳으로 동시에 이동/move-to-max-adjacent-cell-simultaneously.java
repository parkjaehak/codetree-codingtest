import java.util.Scanner;
import java.util.Arrays;
public class Main {

    static int n, m, t;
    static int[] dy = {-1, 1, 0, 0}; // 상하좌우
    static int[] dx = {0, 0, -1, 1};
    static int[][] grid;
    static int[][] count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        t = sc.nextInt();

        grid = new int[n][n];
        count = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int y = sc.nextInt() - 1;
            int x = sc.nextInt() - 1;
            count[y][x] = 1; // 구슬이 있는 위치를 표시
        }

        // t초 동안 구슬 이동 반복
        for (int time = 0; time < t; time++) {
            solve();
        }

        // 남아있는 구슬 개수 세기
        int result = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                result += count[i][j];

        System.out.print(result);
    }

    static void solve() {
        int[][] nextCount = new int[n][n];

        // 모든 위치에서 구슬 이동 시도
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (count[i][j] == 1) { // 구슬이 존재하는 경우만 이동
                    int maxVal = 0, maxY = i, maxX = j;

                    for (int d = 0; d < 4; d++) {
                        int ny = i + dy[d];
                        int nx = j + dx[d];

                        if (ny < 0 || nx < 0 || ny >= n || nx >= n)
                            continue;
                        
                        if (grid[ny][nx] > maxVal) {
                            maxVal = grid[ny][nx];
                            maxY = ny;
                            maxX = nx;
                        }
                    }

                    // 구슬 이동 후 새로운 위치에 추가
                    nextCount[maxY][maxX] += 1;
                }
            }
        }

        // nextCount를 count에 복사
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                count[i][j] = nextCount[i][j];

        // 충돌 처리: 2개 이상 구슬이 모이면 삭제
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (count[i][j] >= 2)
                    count[i][j] = 0;
    }
}
