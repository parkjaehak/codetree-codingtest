import java.util.*;

public class Main {
    static int N;
    static int[]dp;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        N = sc.nextInt();
        dp = new int[N + 1];

        dp[0] = 1;
        dp[1] = 1;       

        //루트를 j로 선택하면 왼쪽 서브트리는 j-1개, 오른쪽 서브트리는 i-j개
        for(int i = 2; i <= N; i++){
            for(int j = 1; j <= i; j++){
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        //루트노드가 3이면 1,2,3각각의 루트노드에 대해 왼쪽 서브트리 X 오른쪽 서브트리를 수행
        //카탈란 수

        System.out.println(dp[N]);
    }
}