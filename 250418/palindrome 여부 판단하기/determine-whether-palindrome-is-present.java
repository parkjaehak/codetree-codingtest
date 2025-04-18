import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
       if(process(input)){
            System.out.print("Yes");
       }else{
        System.out.print("No");
       }

    }

    static boolean process(String input){
        int left = 0;
        int right = input.length() - 1;


        while(true){
            if(left >= right){
                break;
            }
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}