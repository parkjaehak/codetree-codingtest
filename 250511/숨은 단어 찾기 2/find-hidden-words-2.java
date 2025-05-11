import java.util.Scanner;
public class Main {
    static int []dy = {-1, -1, 0, 1,1,1,0,-1}; //북동남서 
    static int []dx = {0,1,1,1,0,-1,-1,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for(int j = 0; j < m; j++){
                arr[i][j] = s.charAt(j);
            }
        }
        
        int result = 0;
        for (int i = 0; i < n; i++) {  
            for(int j = 0; j < m; j++){
                
                if(arr[i][j] == 'L'){
                    for(int k = 0; k < 8; k++){
                       int y = i;
                       int x = j;
                       int count = 0;
                            
                        while(true){
                            int ny = y + dy[k];
                            int nx = x + dx[k];
                        
                            if(ny < 0 || nx < 0 || ny >= n || nx >= m){
                                break;
                            }
                            if('E' != arr[ny][nx]){
                                break;
                            }

                             count++;
                            y = ny;
                            x = nx;
                        }

                        if(count == 2){
                            result++;
                        }
                    }

                }

            }
        }

        System.out.print(result);
    }
}