import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // Please write your code here.

        //이진수중 한자리만 바꿔 최댓값을 만들자


        int max = 0;
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            String binary = null;
            //2진수를 10진수로 바꾼다.
            if(c == '1'){
                binary = a.substring(0, i) + '0' + a.substring(i + 1);
            }else if(c == '0'){
                binary= a.substring(0, i) + '1' + a.substring(i + 1);
            }


            int decimal = 0;
            for (int j = 0; j < binary.length(); j++) {
                decimal = decimal * 2 + (binary.charAt(j) - '0');
            }
            
            max = Math.max(decimal, max);
        }
        System.out.print(max);
    }
}