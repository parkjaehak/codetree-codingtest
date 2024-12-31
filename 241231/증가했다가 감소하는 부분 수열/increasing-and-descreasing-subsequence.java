import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int []dpInc;
    static int []dpDec;
    static int []array;

    public static void main(String[] args) throws Exception{
        N = Integer.parseInt(br.readLine());

        array = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        //i번째 인덱스를 기준으로 끝으로 하는 가장 긴 증가 수열, 시작으로 하는 가장 긴 감소 수열 길이
        dpInc = new int[N]; //최장 증가부분 수열의 길이를 저장하는 dp 배열
        dpDec = new int[N];

        for(int i = 0; i < N; i++){
            dpInc[i] = 1;
            for(int j = 0; j < i; j++){
                if(array[j] < array[i]){
                    dpInc[i] = Math.max(dpInc[i], dpInc[j] + 1);
                } //이전 값이 더 작으면 증가한다.
            }
        }

        for(int i = N - 1; i >=0; i--){
            dpDec[i] = 1;
            for(int j = i + 1; j < N; j++){
                if(array[i] > array[j]){
                    dpDec[i] = Math.max(dpDec[i], dpDec[j] + 1);
                }//이후 값이 더 작으면 감소한다.
            }
        }

        int result = 0;
        for(int i = 0; i < N; i++){
            result = Math.max(result, dpInc[i] + dpDec[i] - 1);
        }
        System.out.print(result);
    }
}