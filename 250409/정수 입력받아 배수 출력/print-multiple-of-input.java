import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        for(int i = N; i <= N*5 ; i+=N){
            System.out.print(i + " ");
        }
    }
}