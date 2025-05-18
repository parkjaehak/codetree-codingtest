import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 (k : 0이 들어있는 인덱스의 번호)
        int[] arr = new int[100];
        int k = 0;

        // 0이 입력될 때까지 100개의 정수를 배열에 입력받아 저장합니다.
        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0){
                k = i;
                break;
            }
        }

        // 출력
        System.out.print(arr[k - 3] + arr[k - 2] + arr[k - 1]);
    }
}
