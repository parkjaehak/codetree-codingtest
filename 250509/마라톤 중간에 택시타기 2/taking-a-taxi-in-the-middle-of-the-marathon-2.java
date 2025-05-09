import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] info = new int[2][n];
        for (int i = 0; i < n; i++) {
            info[0][i] = sc.nextInt(); //x
            info[1][i] = sc.nextInt(); //y
        }
        // Please write your code here.
        int min = Integer.MAX_VALUE;
     
        for(int i = 1; i < n - 1; i++){
            int sum = 0;
            int prev = 0;

            for(int j = 1; j < n; j++){
                if(j == i){
                    continue;
                }
                int cx = info[0][j];
                int cy = info[1][j];
                int prevX = info[0][prev];
                int prevY = info[1][prev];

                sum += Math.abs(cx - prevX) + Math.abs(cy - prevY);
                prev = j;

            }


            min = Math.min(min, sum);
        }
        System.out.print(min);
    }
}