import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        
        int result;
        if(n % 2 == 0){
            result = process(n);
        }else{
            result = process1(n);
        }
        System.out.print(result);
       
    }

    static int process(int n){
        //짝수
        if(n == 2){
            return n;
        }
        return process(n - 2) + n;
    }

    static int process1(int n){
        //홀수
        if(n == 1){
            return n;
        }
        return process1(n - 2) + n;
    }


}