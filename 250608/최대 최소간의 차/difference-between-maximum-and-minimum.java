import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        //M - m <= k

        //최소 비용
        //6 3 7 3 5 -> 3 3 5 6 7 : k = 2
        // 3 5 , 4 6, ... 5 7
        //최대 최소를 기준잡자


        Arrays.sort(arr);
        int max = arr[n - 1];
        int min = arr[0];
        int minValue = Integer.MAX_VALUE;
        for(int low = min; low <= max - k; low++){
            int high = low + k;
            int cost = 0;

            for(int i = 0; i < n; i++){
                if(arr[i] < low){
                    cost += Math.abs(low - arr[i]);
                }else if(arr[i] > high){
                    cost += Math.abs(arr[i] - high);
                }
            }
            minValue = Math.min(cost, minValue);
        }
        System.out.print(minValue);
    }
}