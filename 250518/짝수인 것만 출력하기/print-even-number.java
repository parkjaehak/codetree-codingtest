import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n = sc.nextInt();

        // 배열 선언
        int[] arr = new int[100];
        int[] newArr = new int[100];
        int cnt = 0;

        // n개의 정수를 입력받아 배열에 저장
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // n개의 정수 중 짝수만 새로운 배열에 저장
        for(int i = 0; i < n; i++)
            if(arr[i] % 2 == 0)
        	    newArr[cnt++] = arr[i];

        // n개의 정수 중 짝수만 출력
        for(int i = 0; i < cnt; i++)
            System.out.print(newArr[i] + " ");
    }
}
