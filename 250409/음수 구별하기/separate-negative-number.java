import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N < 0){
            System.out.println(N + "\n" + "minus");
        }else{
            System.out.println(N);
        }
       
    }
}