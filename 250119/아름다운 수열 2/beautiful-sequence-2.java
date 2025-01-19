import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static int []A;
    static int []B;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        A = new int[N];
        B = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< M; i++){
            B[i] = Integer.parseInt(st.nextToken());
        }

        //중복가능하지만 연속해야됨
        int result = count();
        System.out.print(result);

    }   

    static int count(){
        Arrays.sort(B);
        int count = 0;

        for(int i = 0; i<= N-M; i++){
            int []subSequence = Arrays.copyOfRange(A, i, i + M); //0~3
            Arrays.sort(subSequence);

            // 정렬된 B와 비교
            if (Arrays.equals(subSequence, B)) {
                count++;
            }
        }
        return count;
    }
}