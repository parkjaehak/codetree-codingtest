import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.

        int []result = process(a,b);
        System.out.print(result[0] + " " + result[1]);
    }
    static int[] process(int a, int b){
   
        if(a > b){
            return new int[]{a + 25, b * 2};
        }else{
            return new int[]{a * 2, b + 25};
        }



    }
}