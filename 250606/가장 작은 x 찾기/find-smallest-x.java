import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        // Please write your code here.
        //x의 최솟값


        
        
        for(int k = 1; k <= 10000; k++){
            
            boolean satisfied = true;
            int curr = k;
            for(int i = 0; i < n; i++){
                curr *= 2;
                //x는 a 이상 b 이하
                int a1 = a[i];
                int b1 = b[i];

                if(curr < a1 || curr > b1){
                    satisfied = false;
                    break;
                }
            } 

            if(satisfied){
                System.out.print(k);
                break;
            }
        }
        
    }
}