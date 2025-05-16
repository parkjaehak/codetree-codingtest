import java.util.Scanner;

public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        // Please write your code here.


        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= n; k++){
                    if((close(i, a) && close(j, b) && close(k, c) )
                          || (close(i, a2) && close(j, b2) && close(k, c2))){
                            count++;    
                        }
                }
            }
        }
        System.out.print(count);
    }
    static boolean close(int x, int y) {
        int diff = Math.abs(x - y);
        return Math.min(diff, n - diff) <= 2;
    } 
}