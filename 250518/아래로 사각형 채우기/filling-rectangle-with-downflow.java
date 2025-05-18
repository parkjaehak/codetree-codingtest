import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2차원 배열을 구현합니다.
        int[][] arr = new int[10][10];
        
        // n을 입력받습니다.
        int n = sc.nextInt();
        int num = 1;
        
        // 배열의 숫자를 채웁니다.
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                arr[j][i] = num++;
                
        // 채워진 배열을 출력합니다.
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
