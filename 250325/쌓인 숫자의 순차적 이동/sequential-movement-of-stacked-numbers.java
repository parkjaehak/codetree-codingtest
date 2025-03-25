import java.util.Scanner;
import java.util.*;

public class Main {
    static int N, M;
    static int[]dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[]dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static ArrayList<Integer>[][] blocks;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        blocks = new ArrayList[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                blocks[i][j] = new ArrayList<>();
                blocks[i][j].add(sc.nextInt());
            }
        }
    
      
        //숫자가 움직일때 주위 가장 큰 숫자가 있는 칸으로 이동
        //이동하면 기존 숫자 위에 위치
        //이동할때 숫자 위에 있는 수와 함께 이동
        for(int m = 0; m < M; m++){
            process(sc.nextInt());
        }

        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                ArrayList<Integer> block = blocks[i][j];
                if(block.isEmpty()){
                    System.out.println("None");
                }else{
                    for(int k = block.size() - 1; k >= 0; k--){
                        System.out.print(block.get(k) + " ");
                    }
                    System.out.println();
                }
            }
        }

    }

    static void process(int num){
        //격자에 해당하는 숫자를 이동시킨다.
        int currY = 0; int currX = 0;
        int nextY = 0; int nextX = 0;

        //현재 위치 찾기
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                ArrayList<Integer> curr = blocks[i][j];
             
                    if(curr.contains(num)){
                        //현재 위치를 가장 큰 숫자로 이동시킨다.
                        currY = i;
                        currX = j;
                    }
                
            }
        }
        //바꿀 위치 찾기
        int max = 0;
        for(int k = 0; k < 8; k++){
            int ny = currY + dy[k];
            int nx = currX + dx[k];

            if(ny < 0 || nx < 0 || ny >= N || nx >= N){
                continue;
            }
            for(int l = 0; l < blocks[ny][nx].size(); l++){
                if(blocks[ny][nx].get(l) > max){
                    max = blocks[ny][nx].get(l);
                    nextY = ny;
                    nextX = nx;
                }
            }
        }
    
        //위에 있는 수와 함께 이동한다.
        move(num, currY, currX, nextY, nextX);

    }

    static void move(int num, int currY, int currX, int nextY, int nextX){
        ArrayList<Integer> currBlock = blocks[currY][currX];

        //현재 숫자 위에 위치한 숫자를 모두 이동 시키고
        boolean up = false;
        for(int i = 0; i < currBlock.size(); i++){
            if(currBlock.get(i) == num){
                //현재 위치 찾았다!!
                up = true;
            }
            if(up){
                blocks[nextY][nextX].add(currBlock.get(i)); //그 위에 쌓는다!!
            }
        }


        // 기존 위치의 이동된 값들은 삭제시킨다.
        for(int j = currBlock.size() - 1; j >= 0; j--){
            if(currBlock.get(j) == num){
                currBlock.remove(j);
                break;
                
            }
            currBlock.remove(j);
        }
    }
}