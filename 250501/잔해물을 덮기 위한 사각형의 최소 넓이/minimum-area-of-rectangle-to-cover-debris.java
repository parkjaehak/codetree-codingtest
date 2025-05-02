import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt() + 1000;
        int y1 = sc.nextInt() + 1000;
        int x2 = sc.nextInt()+ 1000;
        int y2 = sc.nextInt()+ 1000;

        int x3 = sc.nextInt()+ 1000;
        int y3 = sc.nextInt()+ 1000;
        int x4 = sc.nextInt()+ 1000;
        int y4 = sc.nextInt()+ 1000;
        // Please write your code here.

        //첫번째 직사각형의 잔해물을 덮기 위한 최소 직사각형


        int [][] array = new int[2001][2001];
        
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                //첫번재 사각형의 범위
                array[j][i] += 1;
            }
        }
        for(int i = x3; i < x4; i++){
            for(int j = y3; j < y4; j++){
                //두번재 사각형의 범위
                array[j][i] += 1;
            }
        }

        int maxX = 0, maxY = 0;
        int minX = 2000, minY = 2000;
        for(int i = x1; i < x2; i++){
            for(int j = y1; j < y2; j++){
                
                if(array[j][i] == 1){
                    maxX = Math.max(i, maxX);
                    maxY = Math.max(j, maxY);
                    minX = Math.min(i, minX);
                    minY = Math.min(j, minY);
                }
              
            }
        }

        int area = 0;
        for(int i = minX; i <= maxX; i++){
            for(int j = minY; j <= maxY; j++){
                area ++;
            }
        }
        System.out.print(area);

    }
}