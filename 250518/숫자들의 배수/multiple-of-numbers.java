import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 선언
        int[] arr = new int[10];
        int cnt = 0;

        // 정수 한 개를 입력받아 배열의 첫 인덱스에 저장
        arr[0] = sc.nextInt();
        
        // 입력받은 정수의 배수를 배열에 저장
        for(int i = 1; i < 10; i++)
            arr[i] = arr[i - 1] + arr[0];
        
        // 배열의 원소들을 출력하다가 5의 배수가 2번 나오면 출력을 멈춤
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
            if(arr[i] % 5 == 0)
                cnt++;
            if(cnt >= 2)
                break;
        }
    }
}
