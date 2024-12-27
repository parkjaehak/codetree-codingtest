import java.util.*;

public class Main {
    static int N;
    static int[][] matrix;
    static boolean[][] visited;
    static int[] dx = {1, 0}; // 아래와 오른쪽
    static int[] dy = {0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        matrix = new int[N][N];

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
                min = Math.min(min, matrix[i][j]);
                max = Math.max(max, matrix[i][j]);
            }
        }

        int result = binarySearch(min, max);
        System.out.println(result);
    }

    // 이분 탐색
    static int binarySearch(int low, int high) {
        int answer = high;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canReach(mid)) {
                answer = mid;
                high = mid - 1; // 더 작은 값이 가능한지 탐색
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    // DP와 BFS/DFS를 이용해 mid 이하로 (N, N)에 도달 가능한지 확인
    static boolean canReach(int limit) {
        visited = new boolean[N][N];
        Queue<int[]> queue = new LinkedList<>();

        if (matrix[0][0] > limit) return false; // 시작점부터 불가능한 경우

        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];

            if (x == N - 1 && y == N - 1) return true; // 도착점에 도달

            for (int i = 0; i < 2; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < N && !visited[nx][ny] && matrix[nx][ny] <= limit) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }

        return false;
    }
}
