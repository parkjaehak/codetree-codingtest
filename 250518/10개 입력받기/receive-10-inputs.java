import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 배열 선언
        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;

        // 10개의 정수를 배열에 입력받으며 0이 있는지 확인합니다. 0이 나오지 않았을 경우 합과 개수를 구합니다.
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
            sum += arr[i];
            cnt++;
        }

        // 평균을 구합니다.
        double avg = (double)sum / cnt;

        //출력
        System.out.printf("%d %.1f", sum, avg);
    }
}
