import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
       

        // X 에서 y까지 수
        int sum = 0;
        for(int i = x; i <= y; i++){
            int d1 = (i / 10000) % 10000;
            int d2 = (i / 1000) % 1000;
            int d3 = (i / 100) % 100;
            int d4= (i / 10) % 10;
            int d5 = i % 10;

            sum = Math.max((d1 + d2 + d3 + d4 + d5), sum);
        }
        System.out.print(sum);
    }
}