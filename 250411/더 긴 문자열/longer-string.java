import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();



        if(a.length() > b.length()){
            System.out.print(a + " " + a.length());
        }else if(a.length() < b.length()){
           System.out.print(b + " " + b.length());
        }else{
            System.out.print("same");
        }
        // Please write your code here.
    }
}