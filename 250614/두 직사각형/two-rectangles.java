import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        
        // Please write your code here.

        //x2 > a1 
        //x2 <= a1 && b1 > y2
        //x2 <= a1 && b2 < y1

        //a2 > x1
        //a2 <= x1 && y1 > b2
        //a2 <= x1 && y2 < b1
        
        // 직사각형이 겹치지 않는 경우
        if (x2 < a1 || a2 < x1 || y2 < b1 || b2 < y1) {
            System.out.print("nonoverlapping");
        } else {
            System.out.print("overlapping");
        }
    }
}