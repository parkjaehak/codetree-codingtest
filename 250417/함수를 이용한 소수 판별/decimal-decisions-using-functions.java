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
        int sum = 0;
        for(int i = a; i <= b; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                //약수가 존재하면 소수가 아니다.
                return false;
            }
        }
        return true;
    }
}