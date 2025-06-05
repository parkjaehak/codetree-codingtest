import java.util.Scanner;
public class Main {

    static int [][] array = new int[3][3];
    static int result = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        //두개 같은 숫자 하나 다른 숫자 332
        for (int i = 0; i < 3; i++) {
            String line = sc.next(); 

            for (int j = 0; j < 3; j++) {
                array[i][j] = line.charAt(j) - '0'; 
            }
        }


        //가로 3줄, 세로 3줄 대각선 2줄 만 확인 총 8가지 방향
        for(int i = 0; i < 3; i++){
            check(array[i][0], array[i][1], array[i][2]);
        }

        for (int j = 0; j < 3; j++) {
            check(array[0][j], array[1][j], array[2][j]);
        }

        check(array[0][0], array[1][1], array[2][2]);
        check(array[0][2], array[1][1], array[2][0]);

         System.out.println(result);

    }

      static void check(int a, int b, int c){
        int c1 = 1, c2 = 0;
        int num1 = a;
        int num2 = 0;

        if(num1 == b){ //a == b
            c1++; //a, b 같은 수
        }else{
            num2 = b; //a != b
            c2++; //a, b 다른 수
        }

        if(num1 == c){
            c1++; //숫자가 모두 일치하는 경우도 포함된다.
        }else if(num2 == 0 || num2 == c){
            num2 = c; //a == b 이거나 b == c이거나 
            c2++;
        }else{
            //숫자가 모두 다르다
            return;
        }

        if(c1 + c2 == 3 && (c1 == 2 || c2 == 2)){
            result++;
        }
      }
}