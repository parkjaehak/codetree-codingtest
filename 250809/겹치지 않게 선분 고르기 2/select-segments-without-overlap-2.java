import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] dp = new int[1000];
        Info [] infos = new Info[1000];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            infos[i] = new Info(x1, x2);
        }
        // Please write your code here.
        //현재 선분 기준 이전까지 겹치지 않는 선분 최대 선분 수 
        
        

        //선분 오름차순 후 dp 사용
         Arrays.sort(infos, 0, n);

        for(int i = 0; i < n; i++){
            dp[i] = 1; //현재 선분이 시작 선분인 경우 1

            for(int j = 0; j < i; j++){
                int x1J = infos[i].x1; //현재 시작점
                int x2J = infos[j].x2; //직전 끝점

                //i번째 선분 선택 전 선택한 선분 j이래 선택 가능한 최대 선분 수

                if(x2J < x1J){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int answer = 0; 
        for(int i = 0; i < n; i++){
            answer = Math.max(answer, dp[i]);
        }

        System.out.print(answer);
    }

     static class Info implements Comparable<Info>{
        int x1, x2;

        public Info(int x1, int x2){
            this.x1 = x1;
            this.x2 = x2;
        }

        @Override
        public int compareTo(Info info){
            return this.x1 - info.x1; //시작점을 기준으로 오름차순 정렬
        }
    }
}