import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int [][] points = new int[N][2]; //체크포인트

        for(int i = 0; i<N; i++){
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int answer = Integer.MAX_VALUE;
        //스킵
        for(int i = 1; i < N - 1; i++){
            int distance = 0;
            int x = points[0][0];
            int y = points[0][0];
        

            for(int j = 1; j < N; j++){
                if(j == i){
                    continue;
                }
                distance += Math.abs(x - points[j][0]) + Math.abs(y - points[j][1]);
                x = points[j][0];
                y = points[j][1];
            }
            if(answer > distance){
                answer = distance;
            }
        }
        System.out.println(answer);

    }
}