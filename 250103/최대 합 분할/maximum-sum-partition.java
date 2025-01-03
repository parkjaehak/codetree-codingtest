import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int totalSum = 0;
        
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        
        // 총합의 절반까지만 고려 (A, B가 동일해야 하므로)
        int target = totalSum / 2;
        
        // DP 배열 초기화 (가능한 합을 저장)  i개의 원소로 sum을 만들 수 있는지 여부를 저장
        boolean[][] dp = new boolean[n + 1][target + 1];
        dp[0][0] = true; // 아무것도 선택하지 않은 경우 합 0 가능
        
        // DP 진행
        for (int i = 1; i <= n; i++) {
            int curr = arr[i];
            for (int sum = target; sum >= curr; sum--) {
                dp[i][sum] = dp[i - 1][sum] || dp[i - 1][sum - curr];
            }
        }
        
        // 가능한 최대 합 X 찾기
        for (int x = target; x >= 0; x--) {
            if (dp[n][x]) {
                System.out.println(x);
                return;
            }
        }
        
        // 기본적으로 0 출력 (모든 수를 C에 넣는 경우)
        System.out.println(0);
    }
}
