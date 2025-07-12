import java.util.Scanner;

public class Main {
    // 손동작 이름: 0=가위, 1=바위, 2=보
    // win[x] = (x가 이길 수 있는 손동작)
    static int[] win = {2, 0, 1}; // 가위(0) > 보(2), 바위(1) > 가위(0), 보(2) > 바위(1)
    static int maxWin = 0;
    static int n;
    static int[] first, second;
    static int[] map = new int[4]; // 1~3 -> 0~2로 매핑

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        first = new int[n];
        second = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
            second[i] = sc.nextInt();
        }

        // 1~3에 대해 0~2(가위, 바위, 보)로 매핑하는 모든 순열을 시도
        boolean[] used = new boolean[4];
        perm(1, used);

        System.out.println(maxWin);
    }

    // idx: 현재 숫자(1~3)
    // used: 이미 매핑에 사용된 손동작
    static void perm(int idx, boolean[] used) {
        if (idx == 4) { // 1~3 모두 매핑 완료
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                int f = map[first[i]];   // 첫번째 사람의 손동작(0~2)
                int s = map[second[i]];  // 두번째 사람의 손동작(0~2)
                if (win[f] == s) cnt++;  // 이기는 경우
            }
            if (cnt > maxWin) maxWin = cnt;
            return;
        }
        for (int i = 0; i < 3; i++) {
            if (!used[i]) {
                used[i] = true;
                map[idx] = i; // idx(1~3)에 i(0~2) 손동작 할당
                perm(idx + 1, used);
                used[i] = false;
            }
        }
    }
}
