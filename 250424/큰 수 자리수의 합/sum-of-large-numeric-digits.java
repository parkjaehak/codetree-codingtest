import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt() * sc.nextInt() * sc.nextInt();


        int sum =process(total);
        System.out.print(sum);


    }

    static int process(int total){
        if(total == 0){
            return 0;
        }
       int r = total % 10;
       return r + process(total / 10);
    }
}