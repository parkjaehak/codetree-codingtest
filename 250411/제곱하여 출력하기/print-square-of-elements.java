import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int []a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print((int)Math.pow(a[i], 2) + " "); //pow()는 double을 반환하므로 int 형변환한다.
        }
    }
}