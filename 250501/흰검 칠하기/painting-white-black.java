import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 충분히 큰 배열로 인덱스 중앙을 100_000으로 설정
        int OFFSET = 100_000;
        int SIZE = 200_001;
        int[] color = new int[SIZE];      // 0: 미칠, 1: 흰, 2: 검, 3: 회
        int[] whiteCnt = new int[SIZE];
        int[] blackCnt = new int[SIZE];

        int pos = OFFSET; // 시작 위치

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);

            if (dir == 'L') {
                for (int j = 0; j < x; j++) {
                    // 현재 칸 먼저 처리
                    if (color[pos] != 3) {
                        whiteCnt[pos]++;
                        if (whiteCnt[pos] >= 2 && blackCnt[pos] >= 2) {
                            color[pos] = 3; // 회색
                        } else {
                            color[pos] = 1; // 흰색
                        }
                    }
                    pos -= 1; // 왼쪽으로 이동
                }
                pos += 1; // 마지막 칸에서 한 칸 더 빠졌으므로 복구
            } else { // dir == 'R'
                for (int j = 0; j < x; j++) {
                    if (color[pos] != 3) {
                        blackCnt[pos]++;
                        if (whiteCnt[pos] >= 2 && blackCnt[pos] >= 2) {
                            color[pos] = 3; // 회색
                        } else {
                            color[pos] = 2; // 검은색
                        }
                    }
                    pos += 1; // 오른쪽으로 이동
                }
                pos -= 1; // 마지막 칸에서 한 칸 더 나갔으므로 복구
            }
        }

        int white = 0, black = 0, gray = 0;
        for (int c : color) {
            if (c == 1) white++;
            else if (c == 2) black++;
            else if (c == 3) gray++;
        }

        System.out.println(white + " " + black + " " + gray);
    }
}
