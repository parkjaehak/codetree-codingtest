import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int [] dp = new int[n]; //dp[i]는 처음부터 i번째 위치에 도착했을때 최대 점프 횟수



        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); //최대 점프 가능한 거리
            dp[i] = -1; //도달하지 못한 위치
            
        }
        // Please write your code here.
        dp[0] = 0;


        for(int i = 0; i < n; i++){
            if(dp[i] == -1){
                continue;
            }

            for(int j = 1; j <= arr[i]; j++){
                //최대 횟수만큼 점프 가능한가
                if(i + j < n){
                    dp[i + j] = Math.max(dp[i + j], dp[i] + 1);
                }
            }
        }


         // 가장 멀리 도달한 곳의 점프 횟수를 찾아야 함
        int maxJumps = 0;
        for (int i = 0; i < n; i++) {
            maxJumps = Math.max(maxJumps, dp[i]);
        }

        System.out.println(maxJumps);
    }
}