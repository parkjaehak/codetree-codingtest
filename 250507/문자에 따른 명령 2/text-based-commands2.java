import java.util.Scanner;

public class Main {
    static int [] dy = {1, 0, -1 ,0};
    static int [] dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.


        int x = 0, y = 0;
        int dir = 0; //북쪽
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            
            if(c == 'L'){
                dir = (dir + 3) % 4;    
            }else if(c == 'R'){
                dir = (dir + 1) % 4;

            }else if(c == 'F'){
                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.print(x + " " + y);

    }
}