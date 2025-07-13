import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] blocks = new int[n];
     
        int total = 0;
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
            total += blocks[i];
        }
        // Please write your code here.
        int avg = total / n;  // 정수 나눗셈
      
        
        int moves = 0;

        for (int i = 0; i < n; i++) {
            if (blocks[i] > avg) {
                moves += blocks[i] - avg;
            }
        }

        System.out.println(moves);
    }
}