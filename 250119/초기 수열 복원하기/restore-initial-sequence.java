import java.io.*;
import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[]sum;

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        //1 2 3 -> 3 5

        N = Integer.parseInt(br.readLine());

        sum = new int[N - 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++){
            sum[i] = Integer.parseInt(st.nextToken());
        }

        //첫번째 원소 찾기
        for(int n = 1; n <= N; n++){
            int [] A = new int[N];
            A[0] = n;

            boolean isValid = true;
            Set<Integer> used = new HashSet<>();
            used.add(n);

            for(int i = 1; i < N; i++){
                A[i] = sum[i-1] - A[i-1];
                if(A[i] < 1 || A[i] > N || used.contains(A[i])){
                    isValid = false;
                    break; //범위에 없거나 이미 포함되어 있으면
                }
                used.add(A[i]);
            }

            if(isValid){
                for(int i = 0; i < N; i++){
                    System.out.print(A[i] + " ");
                }
                return; //사전순으로 먼저 찾은 수열을 출력
            }
        }
    }
}