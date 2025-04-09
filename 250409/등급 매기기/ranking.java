import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if(a >= 90){
System.out.print("A");
        }else if(a >= 80){
System.out.print("B");
        }else if(a >= 70){
System.out.print("C");
        }else if(a >= 60){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}