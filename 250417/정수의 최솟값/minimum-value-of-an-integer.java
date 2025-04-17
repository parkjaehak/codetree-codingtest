import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        int result = process(a, b,c);
        System.out.print(result);
    }
    static int process(int a, int b, int c){
        int result = 0;
        if(a < b){
            if(a < c){
                result = a;
            }else{
                result = c;
            }
        }else{
            if(b < c){
                result = b;
            }else{
                result = c;
            }
        }

        return result;
    }
}