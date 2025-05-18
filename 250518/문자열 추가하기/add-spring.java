import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 정의합니다.
        String str;
        String hel = "Hello";
        
        // 문자열을 입력받습니다.
        str = sc.next();
        
        // 문자열의 뒤에 Hello를 추가합니다.
        str += hel;
        
        // 합쳐진 문자열을 출력합니다.
        System.out.println(str);
    }
}
