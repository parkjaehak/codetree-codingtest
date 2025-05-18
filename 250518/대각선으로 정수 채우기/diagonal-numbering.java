import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n, m을 입력받습니다.
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int count = 1;

        // 2차원 배열을 구현합니다.
        int[][] arr = new int[100][100];

        // Step 1:
        for(int startCol = 0; startCol < m; startCol++) {
            int currRow = 0;
            int currCol = startCol;

            while(currCol >= 0 && currRow < n) {
                arr[currRow][currCol] = count;

                // 변수 업데이트 :
                currRow++;
                currCol--;
                count++;
            }
        }

        // Step 2:
        for(int startRow = 1; startRow < n; startRow++) {
            int currRow = startRow;
            int currCol = m - 1;

            while(currCol >= 0 && currRow < n) {
                arr[currRow][currCol] = count;

                // 변수 업데이트 :
                currRow++;
                currCol--;
                count++;
            }
        }
                
        // 출력:
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
