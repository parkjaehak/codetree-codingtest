import java.util.Scanner;

public class Main {
    static int [] days =  new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String [] dates = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt(); // 월요일

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int count = 0;
        int dayOfIndex = 0;

        while(true){
            if(dates[dayOfIndex].equals(A)){
                count++;
            }

            if(m1 == m2 && d1 == d2){
                break;
            }
            d1++;
            dayOfIndex = (dayOfIndex + 1) % 7;
            if(d1 > days[m1]){
                d1 = 1;
                m1++;
            }

        }
        System.out.print(count);


        
    }
}