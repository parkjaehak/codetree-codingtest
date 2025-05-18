import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 n과 m을 입력받습니다.
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[100];
        int cnt = 0;
        
        // arr[i]를 입력받은 후 m과 같으면 cnt를 1 증가시킵니다.
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == m)
                cnt++;
        }
        
        // m이 나온 횟수를 출력합니다.
        System.out.print(cnt);
    }
}
