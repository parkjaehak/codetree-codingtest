import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[101];


        for (int i = 0; i < n; i++) {
            int candies = sc.nextInt();
            int position = sc.nextInt();

            array[position] += candies;
        }
        // Please write your code here.
        

        int max = 0;
        //중심을 선택한다.
        for(int i = 0; i <= 100; i++){
            int sum = 0;
            for(int j = i - k; j <= i + k; j++){
                if(j>=0 && j <= 100){
                    sum += array[j];
                }
                max = Math.max(max,sum);
            }
        }
        System.out.print(max);
    }
}