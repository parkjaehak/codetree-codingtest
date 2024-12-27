import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][]array;
    static int[][]dp;
    static int N;
    static List<Info> infos = new ArrayList<>();
    static int[]dy = {-1, 0, 1, 0};
    static int[]dx = {0, 1, 0, -1};
    static int answer = 0;

    public static void main(String[] args) throws Exception {

        N = Integer.parseInt(br.readLine());
        array = new int[N][N];
        dp = new int[N][N];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
                infos.add(new Info(array[i][j], i, j));
                dp[i][j] = 1; //1로 초기화
            }
        }

        Collections.sort(infos);

        //값이 작은 것부터 큰 순서대로 dp 값 갱신
        for(int i = 0; i < infos.size(); i++){
            int y = infos.get(i).y;
            int x = infos.get(i).x;

            for(int j = 0; j < 4; j++){
                int ny = y + dy[j];
                int nx = x + dx[j];

                if(ny < 0 || nx < 0 || ny >= N || nx >= N || array[ny][nx] <= array[y][x]){
                    continue;
                }
                dp[ny][nx] = Math.max(dp[ny][nx], dp[y][x] + 1);
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                answer = Math.max(answer, dp[i][j]);
            }
        }
        System.out.println(answer);
    }

    static class Info implements Comparable<Info>{
        int num, y, x;

        Info(int num, int y, int x){
            this.num = num;
            this.y = y;
            this.x = x;
        }

        @Override
        public int compareTo(Info curr){
            return this.num - curr.num; //오름차순 정렬
        }
    }
}