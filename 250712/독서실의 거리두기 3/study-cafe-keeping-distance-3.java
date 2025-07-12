import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        
        int[] seats = new int[N];
        for (int i = 0; i < N; i++) {
            seats[i] = s.charAt(i) - '0';
        }

        // 1. 빈자리 구간(연속된 0) 모두 찾기
        int maxZeroLen = 0;
        int maxZeroStart = -1;
        int i = 0;

        while(i < N){
            if(seats[i] == 0){
                int start = i;
                while (i < N && seats[i] == 0) i++;
                int len = i - start;
                if (len > maxZeroLen) {
                    maxZeroLen = len;
                    maxZeroStart = start;
                }

            }else{
                i++;
            }
        }


        // 2. 가장 긴 구간의 가운데에 1을 앉힘
        int newSeat = maxZeroStart + maxZeroLen / 2;
        seats[newSeat] = 1;


        // 3. 모든 인접한 1 사이의 거리 중 최소값 계산
        int prev = -1;
        int minDist = N;
        for (int j = 0; j < N; j++) {
            if (seats[j] == 1) {
                if (prev != -1) {
                    minDist = Math.min(minDist, j - prev);
                }
                prev = j;
            }
        }

         System.out.println(minDist);
    }
}