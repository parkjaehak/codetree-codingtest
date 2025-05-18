import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 배열 선언
        int[] arr = new int[10];

        // 10개의 정수를 배열에 입력받아 저장합니다.
        for(int i = 0; i < 10; i++) { 
            arr[i] = sc.nextInt();
        }

        // 3번째, 5번째, 10번째 인덱스에 저장된 값 들의 합
        System.out.print(arr[2] + arr[4] + arr[9]);
    }
}
