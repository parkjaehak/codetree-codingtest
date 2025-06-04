import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        //0 0, 1 0, 0 1, 1 1, 1 2, 2 1,2 2, ...
        int b = C / B;
        int a = C / A;

        int max = 0;
        for(int i = 0; i <= a; i++){
            for(int j = 0; j <= b; j++){
                int sum = 0;
                sum = A * i + B * j;
                 
                if(sum <= C){
                    max = Math.max(sum, max);
                
                }
               
            }
        }

        System.out.print(max);

    }
}