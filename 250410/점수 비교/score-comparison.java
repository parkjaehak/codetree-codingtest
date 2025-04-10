import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt(); //수학
        int a2 = sc.nextInt(); //영어
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        if(a1 > b1 && a2 > b2){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}