import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        //4군데 중 가장 많은 점의 수가 최소
        //M이 최소

        int min = Integer.MAX_VALUE;
        for(int i = 2; i <= 100; i += 2){
            for(int j = 2; j <= 100; j += 2){
                int max = 0;
                int d1 = 0, d2 = 0, d3 = 0, d4 = 0;

                for(int k = 0; k < n; k++){
                    int x1 = x[k];
                    int y1 = y[k];

                    if(x1 < i && y1 < j) {
                        //3사분면
                        d3++;
                    }else if( x1 < i && y1 > j){
                        //4사분면
                        d4++;
                    }else if(x1 > i && y1 > j){
                        //1사분면
                        d1++;
                    }else if(x1 > i && y1 < j){
                        //2사분면
                        d2++;
                    }
                }
                max = Math.max(d1, Math.max(d2, Math.max(d3, d4)));
                min = Math.min(min, max);
            }
        }
        System.out.print(min);   
    }
}