import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[]nums;
    static int[]groupA;
    static int[]groupB;

    public static void main(String[] args) throws Exception{
        N = Integer.parseInt(br.readLine());

        nums = new int[N];
        int total = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            nums[i] = Integer.parseInt(st.nextToken());
            total += nums[i];
        }

        //A, B로 나누고 각 그룹의 합의 차이가 최소가 되도록
        int target = total / 2;
        boolean[]dp = new boolean[target + 1];
        dp[0] = true; //i라는 합을 만드는 것이 가능한지 여부

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            for(int j = target; j >= curr; j--){
                if(dp[j - curr]){
                    //합을 만들 수 있다면
                    dp[j] = true;
                }
            }
        }

        for(int sumA = target; sumA > 0; sumA--){
            if(dp[sumA]){
                total = Math.abs(total - 2 * sumA);
                break;
            }
        }

        System.out.print(total);
    }
}