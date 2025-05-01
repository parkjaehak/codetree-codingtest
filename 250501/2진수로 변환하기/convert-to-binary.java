import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

    
        if (n == 0) {
            System.out.println(0);
        } else {
            toBinary(n);
        }

    }
    
    static void toBinary(int n) {
        if (n == 0) return;
        toBinary(n / 2);
        System.out.print(n % 2);
    }

}