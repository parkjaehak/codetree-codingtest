import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = process(a, b);
        System.out.print(result);
    }

    static int process(int a, int b){
        int count = 0;
        for(int i = a; i <= b; i++){
            if(i % 2 == 0){
                continue;
            }else if(i % 3 == 0 && i % 9 != 0){
                continue;
            }else if(i % 10 == 5){
                continue;
            }
            count++;
        }
        return count;
    }
}