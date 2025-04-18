import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int [] a = new int[]{n,m};
        a = process(n,m);
        System.out.print(a[0] + " " + a[1]);

        
    }

    static int[] process(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        return new int[]{a,b};
    }
}