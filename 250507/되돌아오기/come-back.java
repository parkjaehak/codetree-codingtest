import java.util.Scanner;
public class Main {
    static int []dy = {-1, 0, 1, 0};
    static int []dx = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();



        int time = 0;
        int x = 0, y = 0;

          boolean returned = false;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

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


            for(int j = 0; j < dist; j++){
                y += dy[dirN];
                x += dx[dirN];
                time += 1;
                
                if(y == 0 && x == 0){
                    System.out.println(time);
                    returned = true;
                    break;
                }
            }
            if (returned) break;
        }

       
        if (!returned) {
            System.out.println(-1); // never returned to origin
        }
        
    }
}