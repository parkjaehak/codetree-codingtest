import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 인원 수
        int M = sc.nextInt(); // 메시지 개수
        int p = sc.nextInt(); // 확인할 메시지 번호 (1-based)

        char[] c = new char[M];
        int[] u = new int[M];

        for (int i = 0; i < M; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }

        int[] lastRead = new int[N]; // 각 사람의 마지막 읽은 메시지 번호

        for (int i = 0; i < M; i++) {
            int senderIdx = c[i] - 'A';
            // 송신자는 해당 메시지까지 모두 읽음
            lastRead[senderIdx] = i + 1;
            // 읽지 않은 사람 수가 0이면 모두 읽음 처리
            if (u[i] == 0) {
                Arrays.fill(lastRead, i + 1);
            }
        }

        // p번째 메시지의 읽지 않은 사람 수가 0이면 아무도 출력하지 않음
        if (u[p - 1] == 0) {
            return;
        }

        // p번째 메시지를 읽지 않은 사람 출력
        for (int i = 0; i < N; i++) {
            if (lastRead[i] < p) {
                char name = (char)('A' + i);
                System.out.print(name + " ");
            }
        }
    }
}
