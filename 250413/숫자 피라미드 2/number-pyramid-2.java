import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new  Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            
            for(int j = 0; j < i; j++){
                sum++;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}