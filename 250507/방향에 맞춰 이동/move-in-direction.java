import java.util.Scanner;

public class Main {
    static int [] dy = {1, 0, -1, 0};
    static int []dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            char dir = sc.next().charAt(0);
            int distance = sc.nextInt();
            // Please write your code here.

            int dirN = 0;
            if(dir == 'N'){
                dirN = 0;
            }else if(dir == 'E'){
                dirN = 1;
            }else if(dir == 'S'){
                dirN = 2;
            }else if(dir == 'W'){
                dirN = 3;
            }

            //(0,0) 에서 시작한다
            x += dx[dirN] * distance;
            y += dy[dirN] * distance;
        }

        System.out.print(x + " " + y);
    }
}