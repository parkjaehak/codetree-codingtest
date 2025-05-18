import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열을 정의합니다.
        String str;
        
        // 문자열을 입력받습니다.
        str = sc.next();

        // 정수를 입력받습니다.
        int a = sc.nextInt();

        // 문자열의 길이를 구합니다.
        // cnt : 지금까지 출력한 문자의 개수
        int len = str.length();
        int cnt = 0;

        // 문자열의 맨 뒤에서부터 주어진 개수만큼 출력합니다.
        for(int i = len - 1; i >= 0; i--) {
            // 주어진 개수만큼 출력했을 경우 for문을 나갑니다.
            if(cnt >= a)
                break;
            System.out.print(str.charAt(i));
            cnt++;
        }
    }
}
