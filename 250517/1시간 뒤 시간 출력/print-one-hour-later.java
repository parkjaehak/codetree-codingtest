import java.util.Scanner;

public class Main {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        // 입력 예: "10:20"
        String time = scanner.next();
        // ":"를 기준으로 분리
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        // 1시간 뒤의 시간 계산 (문제 조건에 따라 h는 1~22이므로 단순히 1을 더합니다.)
        h += 1;

        // 결과를 h:m 형식으로 출력
        System.out.println(h + ":" + m);
    }
}
