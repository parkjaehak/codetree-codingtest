import java.util.Scanner;
public class Main {

    static int[] ta;
    static int[] tb;
    static int c,g,h, n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        ta = new int[n];
        tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }


        int max = 0;
        for(int t = 0; t <= 1000; t++){
            max = Math.max(max, calculate(t));
        }
        System.out.println(max);
    }

    static int calculate(int t){
        int result = 0;

        for(int i = 0; i < n; i++){
            int singleResult = 0;
            if(t < ta[i])
                singleResult = c;
            else if(t <=tb[i])
               singleResult = g;
            else
                singleResult = h;

            result += singleResult;
        }
        return result;
    }
}