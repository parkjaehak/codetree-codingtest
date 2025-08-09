import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[1001];
        int[] e = new int[1001];
        int[] p = new int[1001];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            e[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        int []dp = new int[1001];


        // Please write your code here.
        //얻을 수 있는 최대 금액
        //마지막 선택한 알바의 번호가 같다면 얻은 수익이 클수록 좋다
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                //기간 겹치면 안됨
                if(e[j] < s[i]){
                    dp[i] = Math.max(dp[i], dp[j] + p[i]);
                }
            }
        }

        int answer = 0; 
        for(int i = 0; i <= n; i++){
            answer = Math.max(answer, dp[i]);
        }

        System.out.print(answer);

        
    }


}