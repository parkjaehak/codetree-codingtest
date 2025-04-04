import java.util.Scanner;

public class Main {
    static int K, N;
    static int[] selected;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt(); //수의 범위
        N = sc.nextInt(); //뽑을 개수
        selected = new int[N];

        //중복을 고려하는 순열
        backTrack(0);
    }

    static void backTrack(int depth){
        
        if(depth == N){
            //N개 선택을 했다면?
            for(int i = 0; i < N; i++){
                System.out.print(selected[i] + " ");
            }
            System.out.println();
            return;
        }

        //1부터 k 숫자 중 고른다.
        for(int i = 1; i <= K; i++){
            selected[depth] = i; //현 위치의 숫자 저장
            backTrack(depth + 1); //다음 숫자부터 선택가능
        }
    }
}