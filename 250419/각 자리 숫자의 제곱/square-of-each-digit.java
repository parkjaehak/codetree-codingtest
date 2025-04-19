import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.print(process(n));


    }

    static int process(int n){
        if(n == 0){
            return 0;
        }
        int q = n / 10;
        int r = n % 10;
        return process(q) + r * r;

    }
}