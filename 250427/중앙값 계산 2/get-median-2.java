import java.util.*;

public class Main {
    static int [] temp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Please write your code here.

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){ //홀수번쨰 원소

                temp = new int[i + 1];
                for(int j = 0; j <= i; j++){
                    temp[j] = arr[j];
                }
                Arrays.sort(temp);

                System.out.print(temp[(i+2) / 2 - 1] + " ");
            }
        }
      
    }
}