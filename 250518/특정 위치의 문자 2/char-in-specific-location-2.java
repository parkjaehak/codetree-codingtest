import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자 배열 선언
        char[] arr = new char[10];

        // 10개의 정수를 배열에 입력받아 저장합니다.
        for(int i = 0; i < 10; i++) { 
            arr[i] = sc.next().charAt(0);
        }

        // 1번째, 4번째, 7번째 인덱스에 저장된 값 들의 합
        System.out.print(arr[1] + " " + arr[4] + " " + arr[7]);
    }
}
