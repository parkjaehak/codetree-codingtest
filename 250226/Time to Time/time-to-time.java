import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //현재 시각
        int b = sc.nextInt(); //현재 분
        int c = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        int result = 0;
  
        while(true){
            if(a == c && b == d){
                break;
            }
            result++;
            b++;

            if(b == 60){
                a++;
                b = 0;
            }
        }

         System.out.print(result);
    }
}