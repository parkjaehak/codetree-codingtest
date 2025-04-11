import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int lengthIdx = a.length() - 1;
        String newText = a.substring(0, 1) + "a" + a.substring(2, lengthIdx - 1) + "a" + a.substring(lengthIdx);

        System.out.print(newText);
    }
}