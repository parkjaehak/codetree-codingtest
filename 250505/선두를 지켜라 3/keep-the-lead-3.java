import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[1000 * 1000 + 1]; //시간에 따른 위치 
        int [] b = new int[1000 * 1000 + 1];
        

        int posA = 0, posB = 0;
        int timeA = 1, timeB = 1;
        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j = 0; j < t; j++){
                posA += v;
                a[timeA++] = posA;
            }
        }


        for (int i = 0; i < m; i++) {
            int v = sc.nextInt();
            int t = sc.nextInt();

            for(int j = 0; j < t; j++){
                posB += v;
                b[timeB++] = posB;
            }
        }

        int maxTime = Math.min(timeA, timeB);
        int count = 0;
        int prevLead = 0; // 0: 같음, 1: A 선두, 2: B 선두

        for(int i = 1; i < maxTime; i++){
            if (a[i] > b[i]) {
                if (prevLead != 1) {
                    count++;
                    prevLead = 1;
                }
               
            } else if (a[i] < b[i]) {
                if (prevLead != 2) {
                    count++;
                    prevLead = 2;
                }
              
            }else if(a[i] == b[i]){
                if(prevLead != 0){
                    count++;
                    prevLead = 0;                
                }
            }
        }
        System.out.print(count);
    }
}