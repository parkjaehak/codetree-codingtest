import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int result = process(a, b);
        System.out.print(result);
    }
    static int process(int a, int b){
        return (int)Math.pow(a, b);
    }
}