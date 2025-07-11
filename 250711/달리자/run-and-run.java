import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
   
        int totalCost = 0;
        int currDiff = 0;
        for(int i = 0; i < n; i++){
            currDiff += a[i] - b[i];
            totalCost += Math.abs(currDiff);

        }

        System.out.print(totalCost);
    }
}
