import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 문자열 리스트를 정의합니다.
        String[] str = new String[10];
        
        // 문자열을 입력받습니다.
        for(int i = 0; i < 10; i++)
            str[i] = sc.next();
        
        // 문자를 입력받습니다.
        char a = sc.next().charAt(0);
        int cnt = 0;

        // 마지막 문자로 주어진 문자가 나오는 경우 그 문자열을 출력합니다. 그리고 그런 횟수를 구합니다.
        for(int i = 0; i < 10; i++) {
            int len = str[i].length();
            if(str[i].charAt(len - 1) == a) {
                System.out.println(str[i]);
                cnt++;
            }
        }

        // 만족하는 문자열이 없다면 None을 출력합니다.
        if(cnt == 0)
            System.out.println("None");
    }
}
