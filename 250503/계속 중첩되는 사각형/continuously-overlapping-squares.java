import java.util.*;
public class Main {
    static int[][]array = new int[201][201];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            process(x1, y1, x2, y2, i);
        }

        int count = 0;
        for(int x = 0; x < 201; x++){
            for(int y = 0; y < 201; y++){
                if(array[y][x]  == 2){
                    count++;
                }
               
            }
        }   

        System.out.print(count);
    }

    static void process(int x1, int y1, int x2, int y2, int index){
        int color = 0;
        if(index % 2 == 0){
            //빨간색
            color = 1;
        }else{
            //파란색
            color = 2; 
        }
        for(int x = x1; x < x2; x++){
            for(int y = y1; y < y2; y++){
                array[y][x]  = color;
            }
        }   
    }
}