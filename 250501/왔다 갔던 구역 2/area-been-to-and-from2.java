import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] array = new int[2001];

        int startIdx = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            //1000부터 시작한다.
            int delta  = 0;
            if(dir == 'L'){
                delta  = -1;
            }else{
               delta  = 1;
            }

            for(int j = 0; j < x; j++){
                startIdx += delta;
                array[startIdx] += 1;
            }
        }

        int count = 0;
        for(int i = 0 ; i < array.length; i++){
            if(array[i] >= 2){
                count++;
            }
        }

        System.out.print(count);
        }
}