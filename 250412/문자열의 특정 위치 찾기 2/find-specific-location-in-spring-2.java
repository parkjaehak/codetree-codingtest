import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] a = new String[]{"apple", "banana", "grape", "blueberry", "orange"};

        char b = sc.next().charAt(0);

        int count = 0;
        for(int i = 0; i < 5; i++){
            String curr = a[i];
            if(curr.charAt(2) == b || curr.charAt(3) == b){
                System.out.println(curr);
                count++;
            }
        }

        System.out.print(count);
    }
}