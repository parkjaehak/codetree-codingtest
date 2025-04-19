import java.util.Scanner;
public class Main {
    static int m, n;
    static int [] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];


        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.


        System.out.print(process());


    }

    static int process(){
        int sum = 0;
        while(true){
            sum += arr[m];
            if(m == 1){
                break;
            }

            if(m % 2 == 1){
                m -= 1;
            }else{
                m /= 2;
            }
        }

        return sum;
    }
}