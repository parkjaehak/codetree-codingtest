import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.print(process(n));

    }

    static int  process(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }

        return process(n - 1) + process(n - 2);


    }
}