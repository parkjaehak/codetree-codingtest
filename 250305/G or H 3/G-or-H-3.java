import java.util.Scanner;
public class Main {
    static int[] array = new int[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 'G'){
                array[pos] = 1;
            }else{
                array[pos] = 2;
            }
        }

        int max = 0;
        for(int i = 0; i < 10001 - k; i++){
            int sum = 0;
            for(int j = i; j <= i + k; j++){
                sum += array[j];
            }
            max = Math.max(max, sum);
        }
        System.out.print(max);
        
    }
}