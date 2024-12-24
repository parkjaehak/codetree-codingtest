import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int [][]array;
    static int N, H, M;
    static int[]dy={-1,0,1,0};
    static int[]dx={0,1,0,-1};
    static List<int[]> people = new ArrayList<>();
    static List<int[]> shelters = new ArrayList<>();
    static int [][]result;
    static int[][]distance;


    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken()); //사람의 수 : 2
        M = Integer.parseInt(st.nextToken()); //비 피하는 공간의 수 : 3


        array = new int[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                if(array[i][j] == 2){
                    people.add(new int[]{i,j});
                }else if(array[i][j]==3){
                    shelters.add(new int[]{i,j});
                }
            }
        }

        bfs();
        result = new int[N][N];
        
        for(int p = 0; p < people.size(); p++){
            int[] person = people.get(p);
            int y = person[0];
            int x = person[1];
            
            if(distance[y][x] == Integer.MAX_VALUE){
                result[y][x] = -1;
            }else{
                result[y][x] = distance[y][x];
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

    static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        distance = new int[N][N];
        for (int[] row : distance) Arrays.fill(row, Integer.MAX_VALUE);


        for (int[] shelter : shelters) {
            int y = shelter[0];
            int x = shelter[1];
            q.add(new int[]{y, x}); //모든 피난 공간을 큐에 넣는다.
            distance[y][x] = 0; 
        }



        while(!q.isEmpty()){
            int[] curr = q.poll();
            int cy = curr[0];
            int cx = curr[1];
            
            for(int i = 0; i < 4; i++){
                int ny = cy + dy[i];
                int nx = cx + dx[i];

                if(ny < 0 || nx < 0 || ny >= N || nx >= N || array[ny][nx] == 1){
                    continue;
                }
                if(distance[ny][nx] > distance[cy][cx] + 1){
                    distance[ny][nx] = distance[cy][cx] + 1;
                    q.add(new int[]{ny, nx});
                }

            }
        }
    }
}