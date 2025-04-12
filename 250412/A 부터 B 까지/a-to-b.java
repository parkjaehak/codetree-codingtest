import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = 0;

        while(true){
            if(a > b){
                break;
            }
            System.out.print(a + " ");
            if(a % 2 == 1){
                //홀수면 2배 
                a *= 2;
            }else{
                a += 3;
            }
           
        }

    }
}