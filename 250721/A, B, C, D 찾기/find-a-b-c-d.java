import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr);

        //15개의 정수
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        
        int abcd = arr[14];

        //a + b >= c
        //a b c ab 
        int d = abcd - a- b- c;
        System.out.print(a + " " + b + " " + c  + " " + d);
        

    }
}