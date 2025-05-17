import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] strArr = str.split("-");

        // 출력
        System.out.println(strArr[2] + "." + strArr[0] + "." + strArr[1]);
    }
}
