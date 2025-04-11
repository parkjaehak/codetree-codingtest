import java.util.*;

public class Main {

    public static void main(String[] args) {
        char[] a = new char[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            a[i] = sc.next().charAt(0);
        }
        // Please write your code here.

        for(int i = 9; i >= 0; i--){
            System.out.print(a[i]);
        }
    }
}