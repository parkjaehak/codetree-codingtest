import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
         int b = sc.nextInt();
          int c = sc.nextInt();

            int result;
          if(a < b){
            if(a > c){
                result = a;
            }else{
                if(b < c){
                    result = b;
                }else{
                    result = c;
                }
                //중앙 값은 c or b
            }
          }else{
            //b a
            if(a < c){
                result = a;
            }else{
                if(b < c){
                    result = c;
                }else{
                    result = b;
                }
            }
          }

          System.out.print(result);
    }
}