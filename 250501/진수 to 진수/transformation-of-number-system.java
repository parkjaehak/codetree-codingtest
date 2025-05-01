import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        
        int deciN = toDecimal(A, N);
        toB(deciN, B);
    }

    static int toDecimal(int a, String n){
        int num = 0;
        for(int i = 0; i < n.length(); i++){
            num = num * a + (n.charAt(i) - '0');
        }
        return num;
    }

    static void toB(int deciN, int B){
        if(deciN == 0){
            return;
        }
        toB(deciN / B, B);
        System.out.print(deciN % B);
    }
}