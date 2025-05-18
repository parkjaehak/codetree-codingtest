import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n, m을 입력받습니다.
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 2차원 배열을 구현합니다.
        int[][] arr = new int[100][100];

        // Step 1:
        int count = 0;
        for(int col = 0; col < m; col++) {
            if (col % 2 == 0){
                // Case 1:
                for(int row = 0; row < n; row++){
                    arr[row][col] = count;
                    count++;
                }
            }
            else {
                // Case 2:
                for(int row = n - 1; row >= 0; row--){
                    arr[row][col] = count;
                    count++;
                }
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
