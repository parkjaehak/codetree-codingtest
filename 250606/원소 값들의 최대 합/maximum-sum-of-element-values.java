import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        //M번 움직였을때 원소 값 합이 최대를 출력
        int max = 0;
        for(int s = 1; s <= N; s++){
            //시작위치 s
            int sum =  0;
            int start = s;
            for(int m = 0; m < M; m++){
                //m번 반족하였을때 값이 최대
                //움직임 : 수열의 인덱스에 해당하는 값으로 이동하고 해당 값을 더한다.
                int toMove = arr[start];
                start = toMove;
                sum += toMove;
            }
            max = Math.max(sum, max);
        }

        System.out.print(max);
    }
}