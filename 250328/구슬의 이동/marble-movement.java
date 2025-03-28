import java.util.*;

public class Main {
    static int N,M,T,K;
    static int []dy = {-1, 0, 0, 1}; //상 우 좌 하
    static int []dx = {0, 1, -1, 0}; // 3 -dir
    static List<Info> [][]grid;
    static List<Info> [][]nextGrid;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        T = sc.nextInt();
        K = sc.nextInt();
        
        grid = new ArrayList[N + 1][N + 1];
        nextGrid = new ArrayList[N + 1][N + 1];
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                grid[i][j] = new ArrayList<>();
                nextGrid[i][j] = new ArrayList<>();
            }
        }

        for (int i = 0; i < M; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            char d = sc.next().charAt(0); //U D R L
            int v = sc.nextInt();

            int dir = 0;
            if(d == 'U'){
                dir = 0;
            }else if(d == 'D'){
                dir = 3;
            }else if(d == 'R'){
                dir = 1;
            }else{
                dir = 2;
            }
            grid[r][c].add(new Info(v, i + 1, dir)); //속도, 구슬번호, 방향
        }

        for(int t = 0; t < T; t++){
            //t초가 지난 후 격자에 남아있는 구슬의 개수
            process();
        }


        //4. 남아있는 구슬의 개수를 센다.
        int count = 0;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                count += grid[i][j].size();
            }
        }
        System.out.print(count);
        
        
    }

    static void process(){
        
        //1. 일단 움직인다.
        moveAll();
        
        //2. 겹치는지 확인
        checkDuplicate();

        //3. nextGrid를 grid로 옮기고 nextGrid는 초기화한다.
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                grid[i][j].clear();
                grid[i][j].addAll(nextGrid[i][j]);           
                nextGrid[i][j].clear();
            }
        }

    }

    static void checkDuplicate(){
        //특정 칸의 구슬이 K개가 넘는다면
            //우선순위에 따라 K개만 남긴다.
            //우선순위는 v가 높을수록, 구슬의 번호가 높을 수록 살아남는다.

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(nextGrid[i][j].size() >= K){
                    Collections.sort(nextGrid[i][j]); //각 칸마다 정렬한다.
                    for(int k = nextGrid[i][j].size() - 1; k >= K; k--){
                        nextGrid[i][j].remove(k); //우선순위가 낮은 것부터 삭제한다.
                    }
                }
            }

        }
    }

    static void moveAll(){
        for(int y = 1; y <= N; y++){
            for(int x = 1; x <= N; x++){
                for(int i = 0; i < grid[y][x].size(); i++){
                    Info curr = grid[y][x].get(i);
                    moveMarble(curr, y, x);

                }
            }
        }
    }

    static void moveMarble(Info curr, int cr, int cc){
        int ny = cr;
        int nx = cc;
        for(int i = 0; i < curr.v; i++){
            ny = cr + dy[curr.dir];
            nx = cc + dx[curr.dir];
     
            if(ny  < 1 || nx < 1 || ny > N || nx > N){
                curr.dir = 3 - curr.dir;
                ny = cr + dy[curr.dir];
                nx = cc + dx[curr.dir]; //방향 바꾸기
            }
            cr = ny;
            cc = nx;
        }

        nextGrid[ny][nx].add(new Info(curr.v, curr.num, curr.dir));

    }




    static class Info implements Comparable<Info> {
        int v, num, dir;
        
        Info(int v, int num, int dir) {
            this.dir = dir;
            this.v = v;
            this.num = num;
        }

        @Override
        public int compareTo(Info other){
            if(this.v != other.v){
                return Integer.compare(other.v, this.v); //더 큰 것이 우선
            }
            return Integer.compare(other.num, this.num); //번호가 더 큰 것이 우선
        }       
    }
}