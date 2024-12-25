import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][]array;
    static int N, K;
    static List<int[]> positions = new ArrayList<>();
    static int minTime = Integer.MAX_VALUE;
    static List<int[]> walls = new ArrayList<>();
    static List<int[]> selectWalls = new ArrayList<>();
    static int[]dy = {-1, 0, 1, 0};
    static int[]dx = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken()); // 제거할 벽의 개수

        array = new int[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                if(array[i][j] == 1){
                    walls.add(new int[]{i, j});
                }
            }
        }

        
        for(int p = 0; p < 2; p++){
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken()) - 1;
            int x = Integer.parseInt(st.nextToken()) - 1;
            positions.add(new int[]{y, x}); //시작위치, 종료위치
        }
        

        selectWall(0, 0);

        if(minTime == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
            System.out.println(minTime);
        }
    }

    static void selectWall(int count, int start){

        if(count == K){
            int result = bfs();
            minTime = Math.min(result, minTime);
            return;
        }

        for(int i = start; i < walls.size(); i++){
            int[] wall = walls.get(i);
            selectWalls.add(new int[]{wall[0], wall[1]});
            array[wall[0]][wall[1]] = 0;
            selectWall(count + 1, i + 1); //다음벽 선택
            array[wall[0]][wall[1]] = 1;
            selectWalls.remove(selectWalls.size()-1);
        }
    }

    static int bfs(){
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[N][N];

        int[]start = positions.get(0);
        int[]end = positions.get(1);
        int startY = start[0];
        int startX = start[1];
        int endY = end[0];
        int endX = end[1];

        q.add(new int[]{startY, startX, 0}); //시작위치
        visited[startY][startX] = true;

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int y = curr[0], x = curr[1], time = curr[2];

            // // 도착점에 도달했으면 시간 반환
            // if (y == endY && x == endX) {
            //     return time;
            // }

            for(int i = 0; i < 4; i++){
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny < 0 || nx < 0 || ny >= N || nx >= N || visited[ny][nx] || array[ny][nx] == 1){
                    continue;
                }
                if(ny == endY && nx == endX){
                    return curr[2] + 1;
                }
                q.add(new int[]{ny, nx, time + 1});
                visited[ny][nx] = true;
            }
        }
        return Integer.MAX_VALUE; //종료위치를 찾지 못하였다.
    }
}