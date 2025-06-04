import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] array = new int[3][n];
        for (int i = 0; i < n; i++) {
            array[0][i] = sc.nextInt();
            array[1][i] = sc.nextInt();
            array[2][i] = sc.nextInt();
        }
        // Please write your code here.
        int max = 0;

        for(int i = 1; i <= 3; i++){
            int []cups = new int[4];
            //선택 컵의 종류
            cups[i] = 1;
            int score = 0;
            for(int j = 0; j < n; j++){
                int a = array[0][j]; //1
                int b = array[1][j]; //2 
                int c = array[2][j]; //1

                //a와 b를 변경한다
                //c를 열어본다
                int temp = cups[a];
                cups[a] = cups[b];
                cups[b] = temp;

                if(cups[c] == 1){
                    score += 1;
                }
            }
            max = Math.max(score, max);
        }
        

         System.out.print(max);
    }
}