import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][]array;
    static int[]dy = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[]dx = {0, 1, 1, 1, 0, -1, -1, -1};
    
    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.
       
        array = new int[20][20];
        for(int i = 1; i < 20; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =1; j < 20; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i < 20; i++){
            for(int j =1; j < 20; j++){
                 //1 검정, 2 흰색, 0 빈 곳
                if(array[i][j] != 0){
                    int color = array[i][j];
                    for(int d = 0; d < 8; d++){
                        if(checkWin(i, j, dy[d], dx[d], color)){
                            System.out.println(color);
                            System.out.println((i + dy[d] * 2) + " " + (j + dx[d] * 2));
                            return;
                        }
                    } 
                }
            }
        }
         System.out.println(0);
    }

    private static boolean checkWin(int y, int x, int dy, int dx, int color){
        int count = 1;
        for(int i = 1; i < 5 ;i++){
            int ny = y + dy * i;
            int nx = x + dx * i;

            if(ny < 1 || nx < 1 || ny > 19 || nx > 19 || array[ny][nx] != color){
                return false;
            }
            count++;
        }

        //6목 방지
        int py = y - dy;
        int px = x - dx;
        int ny = y + dy * 5;
        int nx = x + dx * 5;
        if((py >= 1 && px >= 1 && py <= 19 && px <= 19 && array[py][px] == color) ||
            (ny >= 1 && nx >= 1 && ny <= 19 && nx <= 19 && array[ny][nx] == color)){
            return false;
        }
        return count == 5;
    }
}