import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.

        int n = toDecimal(binary);
        toBinary(n * 17);

    }

    static void toBinary(int n){
        if(n == 0){
            return;
        }

        toBinary(n / 2);
        System.out.print(n%2);

    }

    static int toDecimal(String binary){
        int num = 0;
        for(int i = 0; i < binary.length(); i++){
             num = num * 2 + (binary.charAt(i) - '0');
        }

      return num;
    }
}