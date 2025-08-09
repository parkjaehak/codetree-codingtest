import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        //각 인덱스 끝나는 증가 부분 수열 최대 길이 + 감소 부분 수열 최대 길이

        //dp[i][j]
        // 마지막 고른 위치가 i + 현재 증가 - 감소 상태가 j일때 (증가 0, 감소 1)
        // 부분 수열 중 최장 증가감소 부분 수열의 길이
        int [][]dp = new int[1000][2];

        for(int i = 0; i < n; i++){
            dp[i][0] = 1;
            dp[i][1] = 1;

            for(int j = 0; j < i; j++){
                //증가
                if(arr[j]< arr[i]){
                    dp[i][0] = Math.max(dp[i][0], dp[j][0] + 1);
                }

                if(arr[j] > arr[i]){
                    dp[i][1] = Math.max(dp[i][1], dp[j][1] + 1);
                }
            }


            //변곡점인 경우
            dp[i][1] = Math.max(dp[i][1], dp[i][0]);

        }

        int answer = 0;
         for(int i = 0; i < n; i++){
            answer = Math.max(answer, dp[i][1]);
         }

         System.out.print(answer);

    }
}