import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        // 200 크기의 배열을 생성 (좌표 범위가 0~199 가정)
        int[] array = new int[200];

        // 선분이 존재하는 구간을 기록
        for (int i = 0; i < n; i++) {
            int start = x1[i];
            int end = x2[i];

            for (int j = start; j < end; j++) { // end는 포함하지 않음
                array[j] += 1;
            }
        }

        // 최댓값 찾기
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // 최댓값 출력 (최대 겹치는 선분 개수)
        System.out.println(max);
        sc.close();
    }
}
