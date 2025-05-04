import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] penalizedPerson = new int[m];
        int [] count = new int[n + 1];


        for (int i = 0; i < m; i++) {
           penalizedPerson[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
           int num = penalizedPerson[i];
           count[num] += 1;

            if (count[num] >= k) {
                System.out.print(num); // 처음으로 k번 초과한 사람
                return;
            }
        }
        System.out.print(-1);


        // Please write your code here

    }
}