import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int [] a = new int[10];

        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
        }

        int countA = 0;
        int countB = 0;
        for(int i = 0; i < 10; i++){
            if(a[i] % 3 == 0){
                countA++;
            }
            if(a[i] % 5 == 0){
                countB++;
            }
            
        }

        System.out.print(countA + " " + countB);
    }
}