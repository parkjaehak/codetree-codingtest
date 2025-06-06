import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] array = new int[M][2];
        for (int i = 0; i < M; i++) {
            array[i][0] = sc.nextInt(); //a
            array[i][1] = sc.nextInt(); //b
        }
        // Please write your code here.

        //많이 나온 쌍의 수
        int max = 0;

        //쌍을 기준 잡고 완전탐색
        for(int m = 0; m < M; m++){
            //m번째 쌍은 몇번 나타나나?

            int a1 = array[m][0];
            int b1 = array[m][1];
            
            int count = 1;
            for(int n = 0; n < M; n++){
                if(m == n){
                    continue;
                }

                int a2 = array[n][0];
                int b2 = array[m][1];

                if((a1 == a2 || a1 == b2) && (b1 == b2 || b1 == a2)){
                    count++;
                }     
            }

            max = Math.max(max, count);
        }
        System.out.print(max);

    }
}