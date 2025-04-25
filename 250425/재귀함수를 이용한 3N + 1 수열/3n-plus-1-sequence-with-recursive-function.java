import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        System.out.print(process(n, 0));
    }

    static int process(int n, int count){

        if(n == 1){
            return count;
        }

        if(n % 2 == 0){
            n /= 2;
            count++;
        }else if(n % 2 == 1){
            n = n * 3 + 1;
            count++;
        }

        return process(n, count);
    }
}