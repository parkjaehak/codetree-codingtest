import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        process(n);
    }
    static void process(int n){
        int result = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result++;
                System.out.print(result + " ");
           
                if(result == 9){
                    result = 0;
                }
            }
            System.out.println();
        }
    }
}