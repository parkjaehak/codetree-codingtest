import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static final int MAX_NUM = 10000;

    public static int n, k;
    public static int[] arr = new int[MAX_N];

    // 구간 [l, r] 
    // 사이에 들어있는 숫자 개수를 반환합니다.
    public static int countNum(int l, int r) {
        int cnt = 0;
        for(int i = 0; i < n; i++)
            if(l <= arr[i] && arr[i] <= r)
                cnt++;

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int ans = 0;
        // 크기가 K인 모든 구간을 잡아
        // 해당 구간 안에 들어오는 숫자의 개수를 세서
        // 그 중 최댓값을 계산합니다.
        for(int i = 1; i <= MAX_NUM; i++) {
            // 구간 [i, i + k] 사이에 들어있는 숫자를 세어
            // 최댓값을 계산합니다.
            ans = Math.max(ans, countNum(i, i + k));
        }

        System.out.println(ans);
    }
}
