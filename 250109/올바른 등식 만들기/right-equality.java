import java.util.*;

public class Main {
    static int N, M;
    static int[] numbers;
    static long[][] dp; // dp[i][sum]: i번째 숫자까지 사용했을 때 sum을 만들 수 있는 경우의 수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        // DP 배열 선언 (-20~20을 표현하기 위해 0~40 사용)
        dp = new long[N][41]; // sum의 범위를 0~40으로 변환하여 저장

        // 첫 번째 숫자로 초기화 (인덱스 변환: +20)
        dp[0][numbers[0] + 20] = 1;
        dp[0][-numbers[0] + 20] = 1; // 음수일 수도 있음

        // DP 진행
        for (int i = 1; i < N; i++) {
            for (int sum = 0; sum <= 40; sum++) {
                if (dp[i - 1][sum] > 0) {
                    int plus = sum + numbers[i]; // 더하는 경우
                    int minus = sum - numbers[i]; // 빼는 경우

                    if (plus >= 0 && plus <= 40) {
                        dp[i][plus] += dp[i - 1][sum];
                    }
                    if (minus >= 0 && minus <= 40) {
                        dp[i][minus] += dp[i - 1][sum];
                    }
                }
            }
        }

        // 목표 M에 해당하는 경우의 수 출력 (M도 인덱스 변환 필요)
        System.out.println(dp[N - 1][M + 20]);
    }
}
