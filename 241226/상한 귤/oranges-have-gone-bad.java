import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[][]array;
    static int N, K;
    static List<int[]> bads = new ArrayList<>();
    static int[]dy = {-1, 0, 1, 0};
    static int[]dx = {0, 1, 0, -1};
    static int[][]result;
    static boolean[][] visited;


    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        array = new int[N][N];
        result = new int[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                if(array[i][j] == 2){
                    bads.add(new int[]{i,j});
                }
                if(array[i][j] == 0){
                    result[i][j] = -1;
                }
            }
        }
        bfs();

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                //끝까지 닿지 않으면 -2
                //방문하지 않았고 array가 1인 경우
                if(!visited[i][j] && array[i][j] == 1){
                    sb.append(-2).append(" ");
                }else{
                    sb.append(result[i][j]).append(" ");
                }
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
    }

    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        visited = new boolean[N][N];

        for(int i = 0; i < bads.size(); i++){
            int[] bad = bads.get(i);
            q.add(new int[]{bad[0], bad[1], 0});
            visited[bad[0]][bad[1]] = true;
        }

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int y = curr[0];
            int x = curr[1];
            int time = curr[2];

            if(array[y][x] == 1 || array[y][x] == 2){
                result[y][x] = time;
            }

            for(int i = 0; i < 4; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny < 0 || nx < 0 || ny >= N || nx >= N || visited[ny][nx] || array[ny][nx] == 0){
                    continue;
                }
                q.add(new int[]{ny, nx, time + 1});
                visited[ny][nx] = true;
            }
        } 
    }
}