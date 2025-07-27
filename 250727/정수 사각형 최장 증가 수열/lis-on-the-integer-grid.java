import java.util.*;

public class Main {

    static int n;
    static int [][]grid = new int[500][500];
    static int [][] dp = new int[500][500]; //해당 칸에서의 지나간 칸의 최대 수
    static int []dx = {-1, 0, 1, 0}; //row
    static int []dy = {0, 1, 0, -1}; //col

    static List<Info> infos = new ArrayList<>();
    static int answer = 0;

    static boolean inRange(int x, int y){
        return 0 <= x && x < n && 0 <= y && y < n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
      
        //각 칸의 값을 기준으로 정렬
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                infos.add(new Info(grid[i][j], i, j));
            }
        }

        Collections.sort(infos);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                //dp 값들은 1로 초기화
                dp[i][j] = 1;
            }
        }

        //작은 칸부터 dp 값 갱신

        for(int i = 0; i < infos.size(); i++){
            int cx = infos.get(i).x;
            int cy = infos.get(i).y;

            for(int j = 0; j < 4; j++){
                int nx = cx + dx[j];
                int ny = cy + dy[j];

                if(inRange(nx, ny) && grid[nx][ny] > grid[cx][cy]){
                    //다음 수가 더 크다면
                    dp[nx][ny] = Math.max(dp[nx][ny], dp[cx][cy] + 1);
                }
            }
            
        }

        // 전체 수들 중 최댓값을 찾습니다.
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                answer = Math.max(answer, dp[i][j]);

        System.out.print(answer);



    }



    static class Info implements Comparable<Info>{
        int num, x, y; //값, 행, 열

        Info(int num, int x, int y){
            this.num = num;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Info info){
            return this.num - info.num; //오름차순 정렬 
        }
    }
}