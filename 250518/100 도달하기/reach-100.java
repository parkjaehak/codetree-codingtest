import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받은 정수를 배열의 두번째 인덱스에 저장
	    int n = sc.nextInt();
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;
        int cnt = 1;

        // 배열을 전전항과 전항을 더한 수로 채워나가고, 그 값이 100을 초과하면 while문을 탈출
        while(true) {
            cnt++;
            arr[cnt] = arr[cnt - 1] + arr[cnt - 2];
            if(arr[cnt] > 100)
                break;
        }

        // 100을 딱 초과한 항까지 배열의 인덱스에 저장된 값을 출력
        for(int i = 0; i <= cnt; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
