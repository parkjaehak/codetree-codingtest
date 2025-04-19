import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.print(process(n));
    }


    static int process(int n){
        if(n == 1){
            return 0;
        }

        if(n % 2 == 0){
            n /= 2;
        }else{
            n /= 3;
        }

        return process(n) + 1;
    }
}