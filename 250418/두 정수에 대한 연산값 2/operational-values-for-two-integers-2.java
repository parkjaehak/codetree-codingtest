import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int [] arr = process(a, b);
        System.out.print(arr[0] + " " +  arr[1]);
    }

    static int [] process(int a, int b){
        if(a > b){
            b += 10;
            a *= 2;
            return new int[]{a,b};
        }else{
            b *= 2;
            a += 10;
            return new int[]{a,b};
        }
    }
}