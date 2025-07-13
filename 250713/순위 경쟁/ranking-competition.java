import java.util.Scanner;
public class Main {
    static  int n;
    static char[]name;
    static int[]value;

    static int scoreA = 0, scoreB = 0, scoreC = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        name = new char[n];
        value = new int[n];
        
        for (int i = 0; i < n; i++) {
            name[i] = sc.next().charAt(0);
            value[i] = sc.nextInt();
        }
       
        int answer = 0;

        for(int i = 0; i < n; i++){
            if(name[i] == 'A'){
                if(status(scoreA, scoreB, scoreC) != status(scoreA + value[i], scoreB, scoreC)){
                    answer++;
                }
                scoreA += value[i];
            }else if(name[i] == 'B'){
                if(status(scoreA, scoreB, scoreC) != status(scoreA, scoreB + value[i], scoreC)){
                    answer++;
                }
                scoreB += value[i];
            }else{
                if(status(scoreA, scoreB, scoreC) != status(scoreA, scoreB, scoreC + value[i])){
                    answer++;
                }
                scoreC += value[i];
            }
        }


        System.out.print(answer);

    }

    static int status(int score1, int score2, int score3){
        
        if(score1 > score2 && score1 > score3){
            return 1;
         
        }else if(score2 > score1 && score2 > score3){
            return 2;
        }else if(score3 > score1 && score3 > score2){
            return 3;
        }else if(score1 == score2 && score2 == score3){
            return 5;
        }else{
            return 4;
        }


        //한명만 1등 (1,2,3), 두명이 1등(4), 세명 모두 1등(5)
    }
}