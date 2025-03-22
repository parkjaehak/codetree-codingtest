import java.util.Scanner;
import java.util.*;

class Marble{
    int y, x, dir;
    public Marble(int y, int x, int dir){
        this.y = y;
        this.x = x;
        this.dir = dir;
    }
}
public class Main {
    static int [] dx = {0, 1, -1, 0};
    static int [] dy = {-1, 0, 0, 1}; //상 우 좌 하
    static List<Marble> marbles;
    static int [][] count;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //테스트 케이스
        
        while(T-- > 0) {
            N = sc.nextInt(); //격자 크기
            int M = sc.nextInt(); //구슬 개수
            count = new int[N + 1][N + 1];
            marbles = new ArrayList<>();
            int dir = 0;
            for (int i = 0; i < M; i++) {
                int y = sc.nextInt();
                int x = sc.nextInt();
                char d = sc.next().charAt(0);
                if(d =='U'){
                    dir = 0;
                }else if (d == 'D'){
                    dir = 3;
                }else if(d == 'R'){
                    dir = 1;
                }else{
                    dir = 2;
                }
                marbles.add(new Marble(y, x, dir));
            }
        
            // 매 초 정해진 방향으로 이동한다.
            //2n 번 동안 이동이 가능하면 그 구슬은 충돌이 안일어난 것이다.
            for(int i = 1; i < 2*N; i++){
                simuate();
                removeCrash();
            }
            System.out.println(marbles.size());
        }
    }
     static void simuate(){
         //구슬 전부 움직인다.
        for(int i = 0; i < marbles.size(); i++){
            int cy = marbles.get(i).y;
            int cx = marbles.get(i).x;
            int dir = marbles.get(i).dir;

            int ny = cy + dy[dir];
            int nx = cx + dx[dir];

            Marble nextMarble;
            //벽인 경우
            if(ny < 1 || nx < 1 || ny > N || nx > N){
                nextMarble = new Marble(cy, cx, 3- dir);
            }else{
                //벽이 아니면 그대로 간다.
                nextMarble = new Marble(ny, nx, dir); 
            }

            //업데이트 한다.
            marbles.set(i, nextMarble);
        }               
    }

    static void removeCrash(){
        ArrayList<Marble> temp = new ArrayList<>();

        for(int i = 0; i < marbles.size();i++){
            int cy = marbles.get(i).y;
            int cx = marbles.get(i).x;
            count[cy][cx]++;
        }

        //충돌 x
        for(int i = 0; i < marbles.size();i++){
            int targetY = marbles.get(i).y;
            int targetX = marbles.get(i).x;
    
            
           if(count[targetY][targetX] < 2){
                temp.add(marbles.get(i));
           }
        }
        
        //count 배열 초기화
        for(int i = 0; i < marbles.size();i++){
            int cy = marbles.get(i).y;
            int cx = marbles.get(i).x;
            count[cy][cx]--;
        }
        
        marbles = temp;
    }
}