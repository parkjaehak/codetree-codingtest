import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        // Please write your code here.

        if(x2 >= x3){
            System.out.print("intersecting");
        }else{
            System.out.print("nonintersecting");
        }
    }
}