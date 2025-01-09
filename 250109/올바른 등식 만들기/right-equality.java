import java.util.*;

public class Main {
    static int N, M, count;
    static int[] numbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        count = 0;

        // 첫 번째 숫자를 더하는 경우
        dfs(1, numbers[0]);

        // 첫 번째 숫자를 빼는 경우
        if (numbers[0] != 0) { // 첫 번째 숫자가 0이면 중복 탐색 방지
            dfs(1, -numbers[0]);
        }

        // 가능한 식의 개수 출력
        System.out.println(count);
    }

    static void dfs(int idx, int sum) {
        // N개의 숫자를 다 사용했을 때 결과 확인
        if (idx == N) {
            if (sum == M) {
                count++;
            }
            return;
        }

        // 다음 숫자를 더하는 경우
        if (sum + numbers[idx] <= 20) {
            dfs(idx + 1, sum + numbers[idx]);
        }

        // 다음 숫자를 빼는 경우
        if (sum - numbers[idx] >= -20) {
            dfs(idx + 1, sum - numbers[idx]);
        }
    }
}
