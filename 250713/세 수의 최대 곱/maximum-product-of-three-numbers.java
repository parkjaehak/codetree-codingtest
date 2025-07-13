import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        //3개의 수를 적절히 선택해 나올 수 있는 곱 중 최댓값
        Arrays.sort(arr); 
        //0선택 x,
        int max1 = 0, max2 = 0; 
        //모두 양수
        // -> 오른쪽부터 가장 큰 세개
        max1 = arr[n - 1] * arr[n -2] * arr[n - 3];

        //음수 2개
        max2 = arr[0] * arr[1] * arr[n - 1];

        System.out.print(Math.max(max1, max2));


    }
}