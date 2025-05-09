import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < a.length; i++){
            int sum = 0;

            for(int j = 0; j < a.length; j++){
                if(i == j){
                    continue;
                }

                sum +=  a[j] * Math.abs(j - i);

            }

            min = Math.min(min, sum);
        }

        System.out.print(min);

    }
}