import java.util.Scanner;
public class Main {
    static  int n;
    static char[]name;
    static int[]value;

    static int scoreA = 0, scoreB = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        name = new char[n];
        value = new int[n];
        
        for (int i = 0; i < n; i++) {
            name[i] = sc.next().charAt(0);
            value[i] = sc.nextInt();
        }
        // Please write your code here.
        int answer = 0;

        for(int i = 0; i < n; i++){
            if(name[i] == 'A'){
                if(status(scoreA, scoreB) != status(scoreA + value[i], scoreB)){
                    answer++;
                }
                scoreA += value[i];
            }else{
                if(status(scoreA, scoreB) != status(scoreA, scoreB + value[i])){
                    answer++;
                }
                scoreB += value[i];
            }
        }
        System.out.print(answer);

    }

    static int status(int score1, int score2){
        if(score1 > score2){
            return 1;
        }else if(score2 > score1){
            return 2;
        }else{
            return 3;
        }
    }
}