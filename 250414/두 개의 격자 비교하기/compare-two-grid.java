import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]array = new int[n][m];
        int [][]array2 = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                array2[i][j] = sc.nextInt();
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(array[i][j] == array2[i][j]){
                    System.out.print(0+ " ");
                }else{
                    System.out.print(1 + " ");
                }
            }
            System.out.println();
        }


    }
}