import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int [][]array;
    static int N, K, U, D;
    static int MaxCity = 0;
    static boolean[][] visited;
    static int[]dy = {-1, 0, 1, 0};
    static int[]dx = {0,1,0,-1};
    

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        U = Integer.parseInt(st.nextToken());
        D = Integer.parseInt(st.nextToken());

        array = new int[N][N];
        for(int i = 0; i < N; i++){
             st = new StringTokenizer(br.readLine());
             for(int j = 0; j < N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
             }
        }

        visited = new boolean[N][N];
        selectCity(0, 0, 0);
        System.out.println(MaxCity);
    }

    static void selectCity(int count, int row, int column){
        if(count == K){
            int cityCount = bfs(row, column);
            MaxCity = Math.max(MaxCity, cityCount);
            return;
        }

        for(int i = 0; i < N; i++){
             for(int j = 0; j < N; j++){
                visited[i][j] = true;
                selectCity(count + 1, i, j);
                visited[i][j] = false;
             }
        }
    }

    static int bfs(int row, int column){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];

        q.add(new int[]{row, column});
        visited[row][column] = true;

        int count = 0;
        while(!q.isEmpty()){
            int[] curr = q.poll();

            for(int i = 0; i < 4; i++){
                int ny = curr[0] + dy[i];
                int nx = curr[1] + dx[i];

                if(ny < 0 || nx < 0 || ny >= N || nx >= N || visited[ny][nx] || array[ny][nx] < U || array[ny][nx] > D){
                    continue;
                }
                visited[ny][nx] = true;
                q.add(new int[]{ny,nx});
                count++;
            }
        }
        return count;
    }

}