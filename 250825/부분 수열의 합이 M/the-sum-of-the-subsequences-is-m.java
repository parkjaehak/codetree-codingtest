import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int []dp = new int[m + 1];
        //dp[i] = 합이 i일때 최소 수열 길이
        Arrays.fill(dp, n + 1); 

        dp[0] = 0;

        for(int a : arr){
            for(int i = m; i >= a; i--){
                dp[i] = Math.min(dp[i], dp[i - a] + 1);
            }
        }

        if (dp[m] == n + 1) {
            System.out.println(-1); 
        } else {
            System.out.println(dp[m]); // 최소 길이
        }

    }
}