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
        int count = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i) && isEven(i)){
                count++;
            }
        }
        return count;
    }


    static boolean isPrime(int num){

        if(num < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int num){
        //모든 자릿수의 합이 짝수인가?
        if(((num / 10) + (num % 10)) % 2 == 0){
                return true;
        }
        return false;
    }
}