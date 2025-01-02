import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            totalSum += nums[i];
        }

        // 최소 차이를 계산하여 출력
        System.out.println(minDifference(nums, totalSum));
    }

    public static int minDifference(int[] nums, int totalSum) {
        int target = totalSum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // 합이 0은 항상 가능

        // DP 업데이트
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        // 가능한 최대 합(sumA) 찾기
        for (int sumA = target; sumA >= 0; sumA--) {
            if (dp[sumA]) {
                return Math.abs(totalSum - 2 * sumA);
            }
        }

        return totalSum; // 기본적으로 반환 (여기 도달하지 않음)
    }
}
