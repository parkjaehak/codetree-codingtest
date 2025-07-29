import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 수열의 길이
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n]; // dp[i]: i번째 숫자를 마지막으로 하는 증가 부분수열의 길이

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            dp[i] = 1; // 자기 자신만 선택할 경우 최소 길이 1
        }

        // DP 수행
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // 가장 큰 값이 LIS의 길이
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, dp[i]);
        }

        System.out.println(maxLen);
    }
}
