import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();

        // 배열 선언
        int[] arr = new int[10];
        arr[0] = p1;
        arr[1] = p2;

        // 앞의 두 수를 더한 값의 일의 자리 숫자를 다음 원소로 합니다.
        for(int i = 2; i < 10; i++)
            arr[i] = (arr[i - 2] + arr[i - 1]) % 10;

        // 10개의 정수를 출력
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
