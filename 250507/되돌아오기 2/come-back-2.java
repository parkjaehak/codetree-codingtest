import java.util.Scanner;
public class Main {
    static int []dy = {-1, 0, 1,0};
    static int []dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        
        int dir = 0;
        int x = 0, y = 0;
        int time = 0;

        for(int i = 0; i < commands.length(); i++){
            char c = commands.charAt(i);
            
            
            if(c == 'L'){
                dir = (dir + 3) % 4;
            }else if(c == 'R'){
                dir = (dir + 1) % 4;
            }else if(c == 'F'){
                x += dx[dir];
                y += dy[dir];
                if(x == 0 && y == 0){
                    time++;
                    break;
                }
            }
            time++;
        }

        System.out.print(time);
    }
}