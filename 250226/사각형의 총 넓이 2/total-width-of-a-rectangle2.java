import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + 100;
            y1[i] = sc.nextInt() + 100;
            x2[i] = sc.nextInt() + 100;
            y2[i] = sc.nextInt() + 100;
        }
        // Please write your code here.

        int [][]array = new int[200][200];

        for(int i = 0; i < n; i++){
            int a1 = x1[i];
            int b1= y1[i];
            int a2 = x2[i];
            int b2 = y2[i];

            for(int x = a1; x < a2; x++){
                for(int y = b1; y < b2; y++){
                    array[y][x] +=1;
                }
            }
        }

        int area = 0;
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (array[i][j] >= 1) {  // 직사각형이 덮어지면 1로 설정됨
                    area++;
                }
            }
        }

        System.out.print(area);
    }
}