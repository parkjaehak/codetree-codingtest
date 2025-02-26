import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 직사각형 A의 좌표
        int ax1 = sc.nextInt() + 1000;
        int ay1 = sc.nextInt() + 1000;
        int ax2 = sc.nextInt() + 1000;
        int ay2 = sc.nextInt() + 1000;
        
        // 직사각형 B의 좌표
        int bx1 = sc.nextInt() + 1000;
        int by1 = sc.nextInt() + 1000;
        int bx2 = sc.nextInt() + 1000;
        int by2 = sc.nextInt() + 1000;
        
        // 직사각형 M의 좌표
        int mx1 = sc.nextInt() + 1000;
        int my1 = sc.nextInt() + 1000;
        int mx2 = sc.nextInt() + 1000;
        int my2 = sc.nextInt() + 1000;

        // 격자 크기 (큰 크기로 설정)
        int[][] array = new int[2000][2000];

        // 직사각형 A 영역을 격자에 표시
        int countA = 0;
        for (int ay = ay1; ay < ay2; ay++) {
            for (int ax = ax1; ax < ax2; ax++) {
                array[ay][ax] += 1;
                countA++;
            }
        }

        // 직사각형 B 영역을 격자에 표시
        int countB = 0;
        for (int by = by1; by < by2; by++) {
            for (int bx = bx1; bx < bx2; bx++) {
                array[by][bx] += 1;
                countB++;
            }
        }

        // 직사각형 M 영역을 격자에 표시
        for (int my = my1; my < my2; my++) {
            for (int mx = mx1; mx < mx2; mx++) {
                array[my][mx] += 1;
            }
        }

        // 격자에서 값이 3 이상인 부분을 계산
        int area = 0;
        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                if (array[i][j] == 2) {
                    area++;
                }
            }
        }

        System.out.println(countA + countB - area);
    }
}
