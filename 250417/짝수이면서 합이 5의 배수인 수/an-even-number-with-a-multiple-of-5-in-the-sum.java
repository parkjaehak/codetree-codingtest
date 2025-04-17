import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        String result = process(n);
        System.out.print(result);
    }

    static String process(int n){
        int r = n % 10;
        int q = n / 10;
        if(n % 2 == 0 && (r + q) % 5 == 0 ){
            return "Yes";
        }else{
            return "No";
        }
    }
}