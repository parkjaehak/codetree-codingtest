import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n을 입력받습니다.
        int n = sc.nextInt();

        // 문자열 리스트를 정의합니다.
        String[] str = new String[10];
        
        // 문자열을 입력받습니다.
        for(int i = 0; i < n; i++)
            str[i] = sc.next();
        
        // lenAll : 전체 문자열의 길이, cnt : 첫번째 문자로 'a'가 나오는 횟수
        int lenAll = 0;
        int cnt = 0;
        
        // 전체 문자열의 길이와 첫번째 문자로 'a'가 나오는 횟수를 구합니다.
        for(int i = 0; i < n; i++) {
            lenAll += str[i].length();
            if(str[i].charAt(0) == 'a')
                cnt++;
        }

        // 문제에서 구하고자 하는 값들을 출력합니다.
	    System.out.print(lenAll + " " + cnt);
    }
}
