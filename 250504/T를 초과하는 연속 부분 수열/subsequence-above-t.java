import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
    
        int cnt = 1;
        int max = 1;
        for(int i = 1; i < n; i++){
            if (arr[i] > t) {
                cnt++;      // 연속 중이면 증가
            } else {
                cnt = 1;    // 연속이 끊기면 초기화
            }

            max = Math.max(cnt, max);
        }
         
        System.out.print(max);
    }
}