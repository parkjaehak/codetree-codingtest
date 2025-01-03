import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int [][]array;
    static int N, K, U, D;
    static int MaxCity = 0;
    static int[]dy = {-1, 0, 1, 0};
    static int[]dx = {0,1,0,-1};
    static List<int[]> selectedCities = new ArrayList<>();
    

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

        
        selectCity(0, 0, 0);
        System.out.println(MaxCity);
    }

    static void selectCity(int count, int startRow, int startCol){
        if(count == K){
            int cityCount = bfs();
            MaxCity = Math.max(MaxCity, cityCount);
            return;
        }

        for(int i = startRow; i < N; i++){
             if(i==startRow){
                for(int j = startCol; j < N; j++){
                    selectedCities.add(new int[]{i, j});
                    selectCity(count + 1, i, j+1);
                    selectedCities.remove(selectedCities.size() - 1);
                }
             }else {
                 for(int j = 0; j < N; j++){
                    selectedCities.add(new int[]{i, j});
                    selectCity(count + 1, i, j+1);
                    selectedCities.remove(selectedCities.size() - 1);
                }
            }
        }
    }

    static int bfs(){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] bfsVisited = new boolean[N][N];

        // 선택된 도시를 초기 방문 처리
        for (int[] city : selectedCities) {
            q.add(city);
            bfsVisited[city[0]][city[1]] = true;
        }


        int count = K;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int cy = curr[0];
            int cx = curr[1];

            for(int i = 0; i < 4; i++){
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if(ny < 0 || nx < 0 || ny >= N || nx >= N || bfsVisited[ny][nx]){
                    continue;
                }
                int diff = Math.abs(array[ny][nx] - array[cy][cx]);
                if(diff < U || diff > D){
                    continue;
                }
                bfsVisited[ny][nx] = true;
                q.add(new int[]{ny,nx});
                count++;
            }
        }
        return count;
    }
}