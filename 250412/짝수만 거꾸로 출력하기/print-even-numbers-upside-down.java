import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
   
        int n = sc.nextInt();
        int[]a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }


        for(int i = n - 1; i >= 0; i--){
            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}