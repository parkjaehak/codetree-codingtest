import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        int []array = new int[101];

        for(int i = a; i < b; i++){
            array[i] += 1;
        }

        for(int j = c; j < d; j++){
            
                array[j] += 1;
            
        }

        int count = 0;
        for(int i = 0; i <= 100; i++){
            if(array[i] >= 1){
                count++;
            }
        }
        System.out.print(count);

    }
}