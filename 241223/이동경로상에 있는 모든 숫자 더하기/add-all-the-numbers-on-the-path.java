import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int [][] array;
    static int N, T;
    static int []dy= {-1, 0, 1, 0}; //북 동 남 서
    static int []dx={0, 1, 0,-1};


    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        String input = br.readLine();

        array = new int[N][N];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <N; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int result = move(input);
        System.out.println(result);
        
    }

    static int move(String input){
        int cr= N / 2;
        int cc = N/ 2;
        int dirIdx = 0;
        int sum = array[cr][cc];
        
        for (int i = 0; i < input.length(); i++) {
            char currChar = input.charAt(i);
            
            if(currChar == 'F'){
                cr += dy[dirIdx];
                cc += dx[dirIdx];
                if(cr < 0 || cr >= N || cc < 0 || cc >= N){
                    cr -= dy[dirIdx];
                    cc -= dx[dirIdx];
                }else{
                    sum += array[cr][cc];
                }

            }else if(currChar == 'R'){
                dirIdx = (dirIdx + 1) % 4;

            }else if(currChar == 'L'){
                dirIdx =(dirIdx + 3) % 4;
            } 
        }

        return sum;
        
    }
}