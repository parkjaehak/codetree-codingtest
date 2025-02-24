import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please Write your code.
        int sum = 0;

        int max = Integer.MIN_VALUE;


        for(int i = 0; i < n; i++){
            sum += nums[i];
            max = Math.max(max, sum);

            // 현재 합이 0보다 작으면 초기화 (음수이면 새로운 시작점 설정)
            if (sum < 0) {
                sum = 0;
            }
        }
        
       
    }
}