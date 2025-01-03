import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        
        // 총합이 홀수면, 두 그룹으로 나눠서 같은 합을 만들 수 없음
        if (totalSum % 2 != 0) {
            System.out.println("No");
            return;
        }

        // 목표는 totalSum / 2
        int target = totalSum / 2;
        
        // DP 배열 초기화 (가능한 합을 저장)
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // 합 0은 언제나 만들 수 있음 (아무것도 선택하지 않은 경우)
        
        // DP 진행
        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            for (int sum = target; sum >= curr; sum--) {
                dp[sum] = dp[sum] || dp[sum - curr];
            }
        }
        
        // 가능한 최대 합이 totalSum / 2이면 YES, 그렇지 않으면 NO
        if (dp[target]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
