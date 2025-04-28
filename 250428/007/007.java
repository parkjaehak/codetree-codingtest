import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode;
        char mPoint;
        int time;
        // Please write your code here.

        sCode = sc.next();
        mPoint = sc.next().charAt(0);
        time = sc.nextInt();

        Info info = new Info(sCode, mPoint, time);

        System.out.println("secret code : " + info.sCode);
        System.out.println("meeting point : " +info.mPoint);
        System.out.println("time : " + info.time);



    }

    static class Info{
        String sCode;
        char mPoint;
        int time;

        Info (String sCode, char mPoint, int time){
            this.sCode = sCode;
            this.mPoint = mPoint;
            this.time = time;
        }
    }
}