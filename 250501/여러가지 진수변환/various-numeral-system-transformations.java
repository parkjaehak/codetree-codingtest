import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        process(n, b);
    }

    static void process(int n, int b){
        if(n == 0){
            return;
        }
        process(n / b, b);
        System.out.print(n % b);
    }
}