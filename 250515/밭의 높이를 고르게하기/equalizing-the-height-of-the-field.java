import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //6
        int h = sc.nextInt(); //3
        int t = sc.nextInt(); //3
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int min = Math.min(n, 10);

        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < n - t; i++){
            //h높이로
            //t번 이상
       
            for(int j = i + t; j <= min; j++){
                int sum = 0;
                for(int k = i; k < j; k++){
                    sum += Math.abs(arr[k] - h);
                }
                minSum = Math.min(minSum, sum);
       
            }
        }

        System.out.print(minSum);
    }
}