import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}