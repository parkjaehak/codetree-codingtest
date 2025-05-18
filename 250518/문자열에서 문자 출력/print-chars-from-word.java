import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 정의합니다.
        String str;
        
        // 문자열을 입력받습니다.
        str = sc.next();
        
        // 문자열을 순회하여 문자를 한 줄에 하나씩 출력합니다.
        for(int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
