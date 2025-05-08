import java.util.Scanner;

public class Main {

    static int []dy = {-1,0,1, 0};
    static int []dx = {0,1,0,-1}; //북 동 남 서
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        int dir = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);

                if(c == '/'){
                    grid[i][j] = 2; 
                }else if(c == '\\'){
                    grid[i][j] = 3;
                }
            }
        }

        int startNum = sc.nextInt();
        // Please write your code here.
        //1~ n 남쪽
        //n + 1 ~ 2n 서쪽
        //2n + 1 ~ 3n 북쪽
        //3n + 1~ 4n //동쪽
        int startX = 0, startY = 0;
        if(startNum >= 1 && startNum <= n){
            dir = 2;
            startY = 0;
            startX = startNum - 1;
            
        }else if(startNum >= n + 1 && startNum <= 2 * n){
            dir = 3;
            startY  = startNum - (n + 1) ;
            startX = n - 1;
        }else if(startNum >= 2 * n + 1 && startNum <= 3 * n){
            dir = 0;
            startY = n - 1;
            startX = 3* n - startNum;
        }else if(startNum >= 3* n + 1 && startNum <= 4* n){
            dir = 1;
            startY = 4*n - startNum;
            startX = 0;
        }


        int cy = startY, cx = startX;
        int count = 0;

       
        while (true) {
            if (cy < 0 || cx < 0 || cy >= n || cx >= n) break;

            if (grid[cy][cx] == 2) {
                // '/' 거울
                if (dir == 0 || dir == 2){
                    dir = (dir + 1) % 4;   
                }else{
                    dir = (dir + 3) % 4;  
                }
                count++;
            } else if (grid[cy][cx] == 3) {
                // '\' 거울
                if (dir == 0 || dir == 2){
                    dir = (dir + 3) % 4;
                   
                }else{
                    dir = (dir + 1) % 4;   
                    
                }
                count++;
            }

            cy += dy[dir];
            cx += dx[dir];
        }
        System.out.println(count);
    }
}