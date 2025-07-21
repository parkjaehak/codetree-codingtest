import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] x1 = new int[n];
        int [] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        // Please write your code here.
        //선분을 모두 포함할 수 있는 가장 짧은 선분의 길이 최소
         int minLength = Integer.MAX_VALUE;

        for (int skip = 0; skip < n; skip++) {
            int minStart = Integer.MAX_VALUE;
            int maxEnd = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (i == skip) continue; // 하나 제외

                minStart = Math.min(minStart, x1[i]);
                maxEnd = Math.max(maxEnd, x2[i]);
            }

            minLength = Math.min(minLength, maxEnd - minStart);
        }

        System.out.println(minLength);
    }
}