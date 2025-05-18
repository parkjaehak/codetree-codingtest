import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] countArr = new int[11];
        int[] arr = new int[100];

        // arr[i]를 입력받은 후 카운팅 배열을 통해 십의 자리수 각각의 빈도 저장, 0이 나오면 for문에서 빠져나오기
        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            if(arr[i] < 10)
                continue;
            countArr[arr[i] / 10]++;
        }

        // 100점대부터 10점대까지 나온 횟수를 출력
        for(int i = 10; i >= 1; i--) {
            System.out.println(i + "0 - " + countArr[i]);
        }
    }
}
