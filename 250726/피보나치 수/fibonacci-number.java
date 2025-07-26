import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        
        int []dp = new int[n];

        if (n == 1) {
            System.out.print(1);
            return;
        }
        
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n; i++){
            dp[i] = dp[i - 1] + dp[i-2];
        }

        System.out.print(dp[n - 1]);
    }
}