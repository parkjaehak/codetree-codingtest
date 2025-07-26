import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        //두 계단 혹은 세 계단만 이동가능

        int []dp = new int[1001];


        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;

        for(int i = 4; i <= n; i++){
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        System.out.print(dp[n] % 10007);

    }
}