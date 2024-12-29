import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static StringTokenizer st;
    static Info[] infos;
    static int[] dp;


    public static void main(String[] args) throws Exception{
        N = Integer.parseInt(br.readLine());
        int x1, x2;
        infos = new Info[N];
        dp = new int[N]; // i번째 선분을 끝으로 겹치지 않게 선택할 수 있는 최대 선분의 수

      
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            infos[i] = new Info(x1, x2);
        }

        //선분을 시작점을 기준으로 오름차순 정렬
        Arrays.sort(infos, 0, N);

        for(int i = 0; i < N; i++){
            dp[i] = 1;

            for(int j = 0; j < i; j++){
                int nx1 = infos[i].x1; //시작점
                int nx2 = infos[j].x2; //끝점

                //i선분과 j선분이 겹치지 않는 경우 중 선택할 수 있는 최대 개수
                if(nx2 < nx1){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int answer = 0;
        for(int i = 0; i < N; i++){
            answer = Math.max(answer, dp[i]);
        }
        System.out.print(answer);
    }

    static class Info implements Comparable<Info> {
        int x1, x2;

        public Info() {
        }

        public Info(int x1, int x2) {
            this.x1 = x1;
            this.x2 = x2;
        }

        @Override
        public int compareTo(Info s) {
            // x1을 기준으로 오름차순 정렬을 진행합니다.
            return this.x1 - s.x1;
        }
    }


}