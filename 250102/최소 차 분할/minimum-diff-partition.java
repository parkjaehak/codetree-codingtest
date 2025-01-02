import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] nums;

    public static void main(String[] args) throws Exception {
        // 입력 처리
        N = Integer.parseInt(br.readLine());
        nums = new int[N];
        int total = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            total += nums[i];
        }

        // DP 배열 초기화
        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // 합 0은 항상 만들 수 있음

        // DP 계산
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }

        // 가능한 합 중 최대값 찾기
        int sumA = 0;
        for (int i = target; i > 0; i--) {
            if (dp[i]) {
                sumA = i;
                break;
            }
        }

        // 최소 차이 계산
        int result = Math.abs(total - 2 * sumA);
        System.out.print(result);
    }
}
