import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }
        // Please write your code here.

        boolean isOk = false;
        for(int i = 0; i < n; i++){
            //1개씩 제거한다.
            int maxX1 = 1;
            int minX2 = 100;

            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }

                maxX1 = Math.max(maxX1, x1[j]);
                minX2 = Math.min(minX2, x2[j]);           
            }

             if(minX2 >= maxX1){
                 isOk = true;
                 break;
             }
        }

        if (isOk) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}