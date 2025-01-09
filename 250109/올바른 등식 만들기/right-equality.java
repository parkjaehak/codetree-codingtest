import java.util.*;

public class Main {
    static int N, M, count;
    static int[] numbers;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            numbers[i] = sc.nextInt();
        }

        // DFS 탐색 시작
        count = 0;
        dfs(1, 0); // 첫 번째 숫자로 시작
        
        // 가능한 식의 개수 출력
        System.out.println(count);
    }

    static void dfs(int idx, int sum) {
        // N개의 숫자를 다 사용했을 때 결과 확인
        if (idx == N + 1) {
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
