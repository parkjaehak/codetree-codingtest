import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        process(n, m);
    }
    static void process(int n, int m){
        //최소 공배수는 두 수의 공통된 배수 중 가장 작은 수
        int max = Math.max(n, m);
        int lcm = max;

        while(true){
            if(lcm % n == 0 && lcm % m == 0) { //나누어 떨어지면 최소공배수임
                break;
            }
            lcm++;  //공배수 될 때까지 1씩 증가
        }
        System.out.print(lcm);
    }
}