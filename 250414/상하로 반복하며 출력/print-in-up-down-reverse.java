import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [][]array = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){ //row
                if(i % 2 == 0){
                    array[j][i] = j + 1;
                }else{
                    array[j][i] = n - j;
                }
            }   
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){ 
                System.out.print(array[i][j]);
            }   
            System.out.println();
        }
    }
}