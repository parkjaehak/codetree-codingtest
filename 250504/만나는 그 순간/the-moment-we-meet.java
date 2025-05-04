import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[1001];
        int [] b = new int[1001]; //매초마다의 위치 기록
        
        // Please write your code here.

        int timeA = 0;
        int posA = 0;
        for(int i = 0; i < n; i++){
            char dir = sc.next().charAt(0);
            int time = sc.nextInt();
            int move = 0;
            if(dir == 'R'){
                move = 1;
            }else if(dir == 'L'){
                move = -1;
            }

            for(int t = 0; t < time; t++){
                posA += move;
                a[++timeA] = posA;
            }
        }

        int timeB = 0;
        int posB = 0;
        for(int j = 0; j < m; j++){
          char dir = sc.next().charAt(0);
            int time = sc.nextInt();
            int move = 0;
            if(dir == 'R'){
                move = 1;
            }else if(dir == 'L'){
                move = -1;
            }

            for(int t = 0; t < time; t++){
                posB += move;
                b[++timeB] = posB;
            }
        }

        
        int maxTime = Math.max(timeA, timeB);
        for(int i = 0; i < maxTime; i++){
            if(a[i] == b[i] && i != 0){
                System.out.print(i);
                return;
            }
        }
        System.out.print(-1);
    }
}