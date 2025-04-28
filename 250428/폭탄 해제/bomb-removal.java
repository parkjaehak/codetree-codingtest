import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        Info info = new Info(uCode, lColor, time);


        System.out.println("code : " + info.code);
         System.out.println("color : " + info.color);
         System.out.println("second : " + info.time);       
    }


    static class Info{
        String code;
        char color;
        int time;

        Info(String code, char color, int time){
            this.code = code;
            this.color = color;
            this.time = time;
        }
    }
}