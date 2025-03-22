import java.util.Scanner;

public class Main {
    static int[][] grid;
    static int N,M;
    static int [] dy = {-1, -1,  0, 1, 1, 1, 0, -1};
    static int [] dx = {0 , 1, 1, 1, 0, -1 ,-1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        grid = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                grid[i][j] = sc.nextInt();
        


        //인접한 칸 중 가장 큰 수와 가운데 칸의 수 교환
        for(int m = 0; m < M; m++){
            //1부터 순서대로 위치를 바꾼다.
            simulate();
        }

        for(int y = 0; y < N; y++){
            for(int x = 0; x < N; x++){
                System.out.print(grid[y][x] + " ");
            }
            System.out.println();
        }
    }
  
    static void simulate(){
        for(int num = 1; num <= N * N; num++){

             //현재 위치 찾기
            int cy = 0;
            int cx = 0;
            for(int y = 0; y < N; y++){
                for(int x = 0; x < N; x++){
                    if(grid[y][x] == num){
                        cy = y;
                        cx = x;
                    }
                }
            }


                //찾은 위치를 기준으로 교체할 위치 탐색
                int max = Integer.MIN_VALUE;
                int my = 0;
                int mx = 0;
                for(int p = 0; p < 8; p++){
                    int ny = cy + dy[p];
                    int nx = cx + dx[p];

                    if(ny < 0 || nx < 0 || ny >= N || nx >= N){
                        continue;
                    }
                    if(grid[ny][nx] > max){
                        max = grid[ny][nx];
                        my = ny;
                        mx = nx;
                    }
                }
                //위치 교환
                swap(cy, cx, my, mx);
            }
        }

        static void swap(int cy, int cx, int my, int mx){
            int temp = grid[cy][cx];
            grid[cy][cx] = grid[my][mx];
            grid[my][mx] = temp;
        }
}