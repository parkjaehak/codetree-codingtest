import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc =new Scanner(System.in);
        
        int M = sc.nextInt();
        int D = sc.nextInt();

        boolean result = process(M,D);
        if(result){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    static boolean process(int m, int d){
        if(m == 1|| m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
            return (d >= 1 && d <= 31);
        }else if(m == 2){
            return (d >= 1 && d <= 28);
        }else if(m == 4 || m ==6 || m ==9 || m == 11){
            return (d >= 1 && d <= 30);
        }else{
            return false;
        }
    }
}