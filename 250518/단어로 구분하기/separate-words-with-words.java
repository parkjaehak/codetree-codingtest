import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 리스트를 정의합니다.
        String[] str = new String[10];
        
        // 공백 단위로 문자열을 입력받습니다.
        for(int i = 0; i < 10; i++)
            str[i] = sc.next();

        // 문자열을 출력합니다.
        for(int i = 0; i < 10; i++)
	        System.out.println(str[i]);
    }
}
