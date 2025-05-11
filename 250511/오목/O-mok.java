import java.util.Scanner;

public class Main {

    static int []dy = { -1, -1, 0, 1, 1,1, 0, -1}; //북 동 남 서
    static int []dx = {0, 1, 1, 1, 0, -1, -1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.

        //검정은 1, 흰색은 2

    
        for(int i = 0; i < 19; i++){
            for(int j = 0; j < 19; j++){
                if(arr[i][j] == 0){
                    continue;
                }

                for(int k = 0; k < 8; k++){
                    int count = 1;
                    int y = i;
                    int x = j;

                    while(true){
                        //방향은 유지한다.
                        int ny = y + dy[k];
                        int nx = x + dx[k];

                        if(ny < 0 || nx < 0 || ny >= 19 || nx >= 19){
                            break;
                        }
                        if(arr[y][x] != arr[ny][nx]){
                            break;
                        }
                        count++;
                        y = ny;
                        x = nx;
                    }
                    if(count == 5){
                        System.out.println(arr[i][j]);
                        System.out.print((i + 2 * dy[k] + 1) + " " + (j + 2 * dx[k] + 1));
                        return;
                    }

                    
                }
            }
        }
         System.out.print(0);
    }
}