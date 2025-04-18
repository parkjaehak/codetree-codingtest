import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.

        //서로다른 알파벳의 수가 2개이상

        if(process(A)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    static boolean process(String input){
        Set<Character> aSet = new HashSet<>();

        for(int i = 0; i < input.length(); i++){
            aSet.add(input.charAt(i));
            if(aSet.size() >= 2){
                return true;
            }
        }

        return false;
    }
}