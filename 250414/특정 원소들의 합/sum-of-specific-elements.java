import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int [][]array = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                array[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){
                sum += array[i][j];
            }
        }
        System.out.print(sum);

    }
}