import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[10000001];//t초일때의 위치 
        int [] b = new int[10000001];


        int timeA = 1, timeB = 1;
        int posA = 0, posB = 0;
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int dir = 0;

            if(d == 'L'){
                dir = -1;
            }else if(d == 'R'){
                dir = 1;
            }

            for(int j = 0; j < t; j++){
                posA += dir;
                a[timeA++] = posA;
            }
        }
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int dir = 0;
            if(d == 'L'){
                dir = -1;
            }else if(d == 'R'){
                dir = 1;
            }

            for(int j = 0; j < t; j++){
                posB += dir;
                b[timeB++] = posB;
            }
        }
        

        int maxTime = Math.max(timeA, timeB);
        // maxTime은 두 로봇 중 더 오래 움직인 시간


        // A가 멈춘 이후에도 마지막 위치를 유지
        for (int i = timeA; i < maxTime; i++) {
            a[i] = a[timeA - 1];
        }

        // B도 마찬가지
        for (int i = timeB; i < maxTime; i++) {
            b[i] = b[timeB - 1];
        }

        int count = 0;
        for(int i = 1; i < maxTime; i++){
            if (a[i] == b[i]) {
                if (a[i - 1] != b[i - 1]) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}