import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Please write your code here.
        System.out.println(N);
        while(true){
            N /= M;
            if(N == 0){
                break;
            }
            System.out.println(N);
        }
    }
}
