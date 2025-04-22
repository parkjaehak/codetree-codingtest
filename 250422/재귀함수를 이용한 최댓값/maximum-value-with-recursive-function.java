import java.util.*;
public class Main {
    static int [] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        System.out.print(process(n-1)); //index
    }

    static int process(int index){

        if(index == 1){
            return Math.max(arr[index], arr[0]);
        }

        return Math.max(process(index - 1), arr[index]);

    }
}