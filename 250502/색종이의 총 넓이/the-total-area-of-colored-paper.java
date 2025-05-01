import java.util.Scanner;
public class Main {
    static int[][] array = new int[201][201];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

    
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.

        //x + 8, y + 8

        for(int i = 0; i < n; i++){
            int cury = y[i];
            int curx = x[i];

            for(int dy = cury; dy < cury + 8; dy++){
               for(int dx = curx; dx < curx + 8; dx++){
                    array[dy][dx] += 1;
               }
            }
        }


        int area = 0;
        for (int i = 0; i < 201; i++) {
            for (int j = 0; j < 201; j++) {
                if (array[i][j] >= 1) {
                    area++;
                }
            }
        }

        
        System.out.println(area);
    }
}