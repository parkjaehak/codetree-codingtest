import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int [][]array;
    static int N, M;
    static int[] dy = {-1,0,1,0};
    static int[]dx={0,1,0,-1};
    static boolean[][]visited;


    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        array = new int[N][M];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        Queue<int[]> outerWater = new LinkedList<>();
        visited = new boolean[N][M];
        outerWater.add(new int[]{0, 0});
        visited[0][0] = true;
        int time = 0;
        int lastMeltedCount = 0;

        while(true){
            //바깥물영역 탐색
            bfs(outerWater);
            //빙하 녹이기
            List<int[]> willMelt = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (array[i][j] == 1 && isNearWater(i, j)) {
                        willMelt.add(new int[]{i, j});
                    }
                }
            }

            //종료 조건
            if(willMelt.isEmpty()){
                break;
            }
            lastMeltedCount = willMelt.size();
            for (int[] curr : willMelt) {
                int y = curr[0];
                int x = curr[1];
                array[y][x] = 0;
                visited[y][x] = true;
                outerWater.add(curr); // 녹은 빙하도 물이 됨
            }
            time += 1;
        }
        System.out.println(time + " " + lastMeltedCount);
     
    }

    static void bfs(Queue<int[]> q){
        while(!q.isEmpty()){
            int[] curr = q.poll();

            for(int i = 0; i < 4; i++){
                 int ny = curr[0] + dy[i];
                 int nx = curr[1] + dx[i];

                 if(ny < 0 || nx < 0 || ny >= N || nx >= M || visited[ny][nx] || array[ny][nx] == 1){
                    continue;
                 }
                 visited[ny][nx] = true;
                 q.add(new int[]{ny, nx});
            }
        }
    }

    static boolean isNearWater(int y, int x) {
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (visited[ny][nx]) return true;
        }
        return false;
    }
}