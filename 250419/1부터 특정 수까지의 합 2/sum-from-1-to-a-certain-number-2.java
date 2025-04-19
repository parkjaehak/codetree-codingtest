import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        int result = process(n);
        System.out.print(result);


    }

    static int process(int n){
        if(n == 1){
            return n;
        }

        return n + process(n-1);
    }
}