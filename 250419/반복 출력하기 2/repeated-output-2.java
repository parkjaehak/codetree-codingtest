import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        process(n);
    }

    static void process(int n){
        if(n == 0){
            return;
        }
        process(n - 1);
        System.out.println("HelloWorld");
    }
}