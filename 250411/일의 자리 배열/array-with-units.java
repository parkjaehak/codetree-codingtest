import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[10];
        
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();

        for(int i = 2; i < 10; i++){
            a[i] = (a[i - 1] + a[i - 2]) % 10;
        }

        for(int i = 0; i < 10; i++){
            System.out.print(a[i] + " ");
        }

      
    }
}