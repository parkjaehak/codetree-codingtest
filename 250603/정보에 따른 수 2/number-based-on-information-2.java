import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char [] c = new char[T];
        int [] pos = new int[T];

        for (int i = 0; i < T; i++) {
            c[i] = sc.next().charAt(0);
            pos[i] = sc.nextInt();
        }
        // Please write your code here.

        int count = 0;
        for(int i = a; i <= b; i++){
            int currPos = i;
         
            int d1 = Integer.MAX_VALUE;
            int d2 = Integer.MAX_VALUE; //거리

            for(int t = 0; t < T; t++){
                if(c[t] == 'S'){
                    //가장 가까운 s까지의 거리
                    d1 = Math.min(Math.abs(pos[t] - currPos), d1);
                }else if(c[t] == 'N'){
                    //가장 가까운 n까지의 거리
                    d2 = Math.min(Math.abs(pos[t] - currPos), d2);
                }
            }


            //s <= n -> 특별한 위치 
            if(d1 <= d2){
                count++;
            }    
        }

        System.out.print(count);
    }
}