import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n = sc.nextInt();

        // 배열 선언
        int[] arr = new int[100];
        int[] newArr = new int[100];

        // n개의 정수를 배열에 입력받아 저장합니다.
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // n개의 정수를 제곱하여 새로운 배열에 넣습니다.
        for(int i = 0; i < n; i++) {
            newArr[i] = arr[i] * arr[i];
        }

        // n개의 정수를 출력합니다.
        for(int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
