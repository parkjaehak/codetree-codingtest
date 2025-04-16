import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int result = process(n,m);
        System.out.print(result);
        //유클리드 호제법
    }

    static int process(int n, int m){
        //최대공약수란 공통으로 나눌 수 있는 가장 큰 수
        //12와 18의 최대 공약수는 6이다.
        if (m == 0) return n;
    
        return process(m, n % m); //m과 나머지의 최대공약수를 반복해서 구한다.
    }
}