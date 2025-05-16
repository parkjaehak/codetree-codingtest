import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        int total = 0;
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }
        
        // Please write your code here.
        //2팀의 차이 최소
        //6명중 3명만 고른다.
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 5; j++){
                for(int k = j + 1; k < 6; k++){
                    int sum1 = ability[i] + ability[j] + ability[k];
                    int sum2 = total - sum1;

                    min = Math.min(Math.abs(sum1 - sum2), min);
                }
            }
        }

        System.out.print(min);
    }
}