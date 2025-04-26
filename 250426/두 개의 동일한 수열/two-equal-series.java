import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // Please write your code here.

        Arrays.sort(a);
        Arrays.sort(b);

        if(process(a, b)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    static boolean process(int[]a, int []b){

        for(int i = 0; i < n; i++){
            if(a[i] != b[i]){
                return false;
            }
        }

        return true;
    }
}