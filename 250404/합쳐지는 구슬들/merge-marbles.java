import java.util.*;

public class Main {
    static int N, M, T;
    static int []dy = {-1, 0, 0, 1}; //위 오 왼 아
    static int []dx = {0, 1, -1, 0};
    static ArrayList<Info> [][]grid;
    static ArrayList<Info> [][]nextGrid;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //격자 크기
        M = sc.nextInt(); //구슬 개수
        T = sc.nextInt(); //시간
        
        grid = new ArrayList[N][N];
        nextGrid = new ArrayList[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = new ArrayList<>();
                nextGrid[i][j] = new ArrayList<>();
            }
        }


        for (int i = 0; i < M; i++) {

            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            char d = sc.next().charAt(0);
            int w = sc.nextInt();
            int num = i+1;
            int dir;
            if(d == 'U'){
                dir = 0;
            }else if(d == 'R'){
                dir = 1;
            }else if(d == 'L'){
                dir = 2;
            }else{
                dir = 3;
            }

            grid[r][c].add(new Info(w, dir, num)); //무게 방향 번호를 저장한다.
        
        }
       
       //방향을 바꾸는데 시간 소요

       for(int t = 0; t < T; t++){
            process();
       }
       //남아있는 구슬의 개수와 무거운 구슬의 무게를 출력한다.
       int count = 0;
       int maxWeight = -1;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(grid[i][j].size() > 0){
                    count++;
                    maxWeight = Math.max(grid[i][j].get(0).w, maxWeight);
                }
            }
        }

        System.out.print(count + " " + maxWeight);

    }


    static void process(){

        //모두 한칸씩 이동시킨다.
        moveAll();

        //한 칸에 여러개가 있는지 체크하고 하나로 합친다.
        checkDuplicate();


        //nextGrid를 grid로 옮기고 nextGrid는 초기화한다.
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                grid[i][j].clear();
                grid[i][j].addAll(nextGrid[i][j]);           
                nextGrid[i][j].clear();
            }
        }
        
    }

    
    static void checkDuplicate(){

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(nextGrid[i][j].size() >= 2){ //2개 이상이면 모두 합쳐라
                    Collections.sort(nextGrid[i][j]); //각 칸마다 정렬한다.

                    //제일 위에 있는 구슬에 모든 무게를 합친다.
                    Info first = nextGrid[i][j].get(0);
                    int totalWeight = 0;

                    for (Info info : nextGrid[i][j]) {
                        totalWeight += info.w;
                    }

                    // for(int k = 0; k < nextGrid[i][j].size(); k++){
                    //     totalWeight += nextGrid[i][j].get(k).w;
                    // }

                    Info merged = first;
                    merged.w = totalWeight;

                    nextGrid[i][j].clear();
                    nextGrid[i][j].add(merged);
                }
            }

        }
    }

    static void moveAll(){

        for(int y = 0; y < N; y++){
            for(int x = 0; x < N; x++){
                //모든 칸을 순회하며 모든 구슬을 이동시킨다.
                //한 칸에는 한개의 구슬만 위치한다.
                //격자가 비어있는 경우는???

                if (!grid[y][x].isEmpty()) {
                    Info curr = grid[y][x].get(0);
                    moveMarble(y, x, curr);
                }
            }
        }
    }

    static void moveMarble(int row, int col, Info curr){

        int ny = row + dy[curr.dir];
        int nx = col + dx[curr.dir];

        if(ny < 0 || ny >= N || nx < 0 || nx >= N){
            //벽을 넘어선다면 방향을 바꾼다. 위치는 그대로이다.
            curr.dir = 3 - curr.dir;
            ny = row;
            nx = col; 
        }
        //다음 칸으로 이동했거나 방향을 바꾼 구슬의 위치를 nextGrid에 저장한다.
        nextGrid[ny][nx].add(new Info(curr.w, curr.dir, curr.num));
    }
    
    
    static class Info implements Comparable<Info>{
       int w, dir, num;

        Info(int w, int dir, int num){
            this.w = w;
            this.dir = dir;
            this.num = num;
        }

        @Override
        public int compareTo(Info other){
            return Integer.compare(other.num, this.num); //번호가 더 큰 것이 우선
        }      
    }
} 
