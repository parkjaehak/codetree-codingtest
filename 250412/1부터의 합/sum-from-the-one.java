import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
            if(sum >= n){
                System.out.print(i);
                break;
            }
        }
    }
}