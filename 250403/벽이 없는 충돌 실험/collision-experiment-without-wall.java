import java.util.*;


public class Main {
    static int T, N;
    static int []dy = {1, 0, 0, -1}; //위 오 왼 아
    static int []dx = {0, 1, -1, 0};
    static ArrayList<Info> marbles = new ArrayList<>(); 
    static ArrayList<Info> nextMarbles = new ArrayList<>(); 
    static int[][] nextMarbleIndex = new int[4001][4001]; 
    static int currTime;
    static int lastTime;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int i = 0; i < 4001; i++){
            for(int j = 0; j < 4001; j++){
                nextMarbleIndex[i][j] = -1;
            }   
        }
          

        for (int t = 0; t < T; t++) {
            N = sc.nextInt(); //구슬 개수
            marbles = new ArrayList<>();
            lastTime = -1;
            int dir;

            for (int i = 0; i < N; i++) {
                int x = (sc.nextInt() * 2) + 2000; //좌표
                int y = (sc.nextInt() * 2) + 2000;
                int w = sc.nextInt();
                char d = sc.next().charAt(0);
                int num = i + 1;
                
                if(d == 'U'){
                    dir = 0;
                }else if(d == 'D'){
                    dir = 3;
                }else if(d == 'R'){
                    dir = 1;
                }else{
                    dir = 2;
                }

                marbles.add(new Info(y, x, w, num, dir));
            }

      
            for(int i = 1; i < 4001; i++){
                //구슬을 한 칸씩 움직이고 충돌한 구슬끼리 합쳐주는 행위를 4000번 한다.
                currTime = i;
                simulate();
            }

            System.out.println(lastTime);
        }

        //가장 마지막으로 충돌이 일어난 시간?
        //2초당 1칸을 움직인다. -> 1초에 1칸이 움직이도록 격자를 2배 증가시킨다.
        //좌표평면에서 벽 없이 진행된다.
        //가장 마지막으로 충돌이 일어난 순시간이 몇 초 뒤 일까?
    }

    static void simulate(){
     
        Info next;
        for(int i = 0; i < marbles.size(); i++){
            //1. 구슬을 한 칸 움직인다.
            Info curr = marbles.get(i);
            int ny = curr.y + dy[curr.dir];
            int nx = curr.x + dx[curr.dir];
            next = new Info(ny, nx, curr.w, curr.num, curr.dir);

            //2. 구슬의 목록을 반영한다.
            if(ny < 0 || ny > 4000 || nx < 0 || nx > 4000){
                //범위를 벗어나면 넘긴다.
                continue;
            }

            //충돌이 일어나는지 확인한다.
            int index = nextMarbleIndex[ny][nx];

            if(index == -1){
                //구슬이 없다
                nextMarbles.add(next);
                nextMarbleIndex[ny][nx] = nextMarbles.size() - 1; //구슬의 인덱스는 0부터 시작한다.
            }else{
                //구슬이 이미 있다면
                //더 영향력이 높은 것만 남긴다.
                Info newInfo = Collide(nextMarbles.get(index), next);
           
                
                nextMarbles.set(index, newInfo);
                lastTime = currTime; //충돌할때만 충돌시간을 기록한다.
            }
        }
        //얕은 복사
        marbles = (ArrayList<Info>) nextMarbles.clone(); //clone 메서드는 ArrayList에 정의되어 있으며 명시적 형변환이 필요하다.
        for(int i = 0; i < nextMarbles.size(); i++){
            nextMarbleIndex[nextMarbles.get(i).y][nextMarbles.get(i).x] = -1;
        }
        nextMarbles = new ArrayList<>();
    }

    static Info Collide(Info curr, Info next){
        if(curr.w > next. w || (curr.w == next.w && curr.num > next.num)){
            return curr;
        }else{
            return next;
        }
    }

    static class Info{

        int y, x, w, num, dir;


        Info(int y, int x, int w, int num, int dir) {
            this.y = y;
            this.x = x;
            this.w = w;
            this.dir = dir;
            this.num = num;
        }
    }
}