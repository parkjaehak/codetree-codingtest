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


        for(int i = 1; i <= 9; i++){
            for(int j = i + 1; j <= 9; j++){
                boolean win = false;

                int num1 = 0, num2 = 0;

                //가로 3번 탐색
                for(int k = 0; k < 3; k++){
                    num1 = 0;
                    num2 = 0;

                    for(int l = 0; l < 3; l++){
                        if(array[k][l] == i){
                            num1++;
                        }
                        if(array[k][l] == j){
                            num2++;
                        }
                    }

                    if(num1 + num2 == 3 && num1 >= 1 && num2 >= 1){
                        win = true;
                    }

                }


                //세로 탐색
                 for(int k = 0; k < 3; k++){
                    num1 = 0;
                    num2 = 0;

                    for(int l = 0; l < 3; l++){
                        if(array[l][k] == i){
                            num1++;
                        }
                        if(array[l][k] == j){
                            num2++;
                        }
                    }

                    if(num1 + num2 == 3 && num1 >= 1 && num2 >= 1){
                        win = true;
                    }

                }


                //대각선
                num1 = 0;
                num2 = 0;
                for(int l = 0; l < 3; l++){
                    if(array[l][l] == i){
                        num1++;
                    }
                    if(array[l][l] == j){
                        num2++;
                    }
                }
                if(num1 + num2 == 3 && num1 >= 1 && num2 >= 1){
                        win = true;
                    }

                num1 = 0;
                num2 = 0;
                for(int l = 0; l < 3; l++){
                    if(array[l][2 - l] == i){
                        num1++;
                    }
                    if(array[l][2 - l] == j){
                        num2++;
                    }
                }
                if(num1 + num2 == 3 && num1 >= 1 && num2 >= 1){
                        win = true;
                    }

                if(win){
                    result++; //이길 수 있었던 팀의 조합의 수를 구한다, 결국 대각선이든 가로든 단 한번이라도 win이면 한번만 추가한다
                }
            }
        }

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