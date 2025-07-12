import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String seats = sc.next();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = seats.charAt(i) - '0';
        }

        int answer = 0;
        // 모든 빈자리에 대해 시도
        for (int i = 0; i < N; i++) {
            if (array[i] == 0) {
                array[i] = 1; // 한 명 앉힘
                int prev = -1;
                int minDist = N;
                
                for (int j = 0; j < N; j++) {
                    if (array[j] == 1) {
                        if (prev != -1) {
                            minDist = Math.min(minDist, j - prev);
                        }
                        prev = j;
                    }
                }
                answer = Math.max(answer, minDist);
                array[i] = 0; // 원상복구
            }
        }
        System.out.println(answer);
    }
}
