import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 배열 크기
        int K = sc.nextInt(); // K개의 범위 입력

        int[][] infos = new int[K][2]; // (A, B) 쌍을 저장할 2차원 배열

        for (int i = 0; i < K; i++) {
            infos[i][0] = sc.nextInt();
            infos[i][1] = sc.nextInt();
        }

        int[] array = new int[N + 1]; // N 크기의 배열

        for (int i = 0; i < K; i++) {
            int start = infos[i][0]; // 시작 인덱스
            int end = infos[i][1];   // 끝 인덱스

            for (int j = start; j <= end; j++) { 
                array[j] += 1;
            }
        }

        // 최댓값 찾기
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i <= N; i++) {
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }

        System.out.println(maxVal);
    }
}
