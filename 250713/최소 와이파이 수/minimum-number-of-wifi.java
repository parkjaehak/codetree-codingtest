import java.util.Scanner;

public class Main {
    public static final int MAX_N = 100;

    public static int n, m;
    public static int[] arr = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int cnt = 0;
        int i = 0;

        while (i < n) {
            // 이 사람이 커버되지 않았다면 와이파이 설치 필요
            if (arr[i] == 1) {
                // 이 사람을 커버할 수 있는 가장 먼 위치에 설치
                int installPos = Math.min(n - 1, i + m);

                // 와이파이 설치
                cnt++;

                // 이 와이파이 커버 범위: [installPos - m, installPos + m]
                // 다음 탐색 시작 위치 = installPos + m + 1
                i = installPos + m + 1;
            } else {
                i++; // 사람이 없으면 다음으로
            }
        }

        System.out.print(cnt);
    }
}
