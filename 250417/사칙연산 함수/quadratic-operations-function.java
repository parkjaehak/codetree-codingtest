import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        int result = 0;
        if(o == '+'){
            result = sum(a, c);
        }else if(o =='-'){
            result = minus(a, c);
        }else if(o == '*'){
            result = multiple(a, c);
        }else if(o == '/'){
            result = division(a, c);
        }else{
            System.out.print("False");
            return;
        }

        System.out.print(a + " " + o + " " + c + " = " + result);

    }

    static int sum(int a, int b){
        return a + b;
    }
    static int minus(int a, int b){
        return a - b;
    }
    static int division(int a, int b){
        return a / b;
    }
    static int multiple(int a, int b){
        return a * b;
    }
}