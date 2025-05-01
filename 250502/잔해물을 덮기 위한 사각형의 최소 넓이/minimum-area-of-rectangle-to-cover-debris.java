import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt() + 1000;
        int y1 = sc.nextInt() + 1000;
        int x2 = sc.nextInt() + 1000;
        int y2 = sc.nextInt() + 1000;

        int x3 = sc.nextInt() + 1000;
        int y3 = sc.nextInt() + 1000;
        int x4 = sc.nextInt() + 1000;
        int y4 = sc.nextInt() + 1000;

        int[][] array = new int[2001][2001];

        // 첫 번째 사각형 표시: 1
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                array[j][i] = 1;
            }
        }

        // 두 번째 사각형으로 덮은 부분은 0으로 초기화 (덮인 부분 제거)
        for (int i = x3; i < x4; i++) {
            for (int j = y3; j < y4; j++) {
                if (array[j][i] == 1) {
                    array[j][i] = 0;
                }
            }
        }

        // 남은 1의 영역 중 최소 직사각형 범위 찾기
        int minX = 2001, minY = 2001, maxX = -1, maxY = -1;
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (array[i][j] == 1) {
                    minX = Math.min(minX, j);
                    maxX = Math.max(maxX, j);
                    minY = Math.min(minY, i);
                    maxY = Math.max(maxY, i);
                }
            }
        }

        // 남은 영역이 없다면 면적은 0
        int area = 0;
        if (minX <= maxX && minY <= maxY) {
            area = (maxX - minX + 1) * (maxY - minY + 1);
        }

        System.out.println(area);
    }
}
