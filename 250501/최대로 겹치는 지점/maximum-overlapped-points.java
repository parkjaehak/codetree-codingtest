import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] array = new int[100];

         
        for (int i = 0; i < n; i++) {
            int startx = start[i];
            int endx = end[i];

            for (int j = startx; j <= endx; j++) {
                array[j] += 1;
            }
        }

        int max = 0;
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
                
            }
        }
        System.out.print(max);
    }
}