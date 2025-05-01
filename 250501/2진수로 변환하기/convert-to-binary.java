import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        if(n == 0){
            System.out.print(0);
        }else{
            process(n);
        }

    }
    static void process(int n){
        if(n == 0){
            return;
        }
        process(n/2);
        System.out.print(n%2);
    }

}