import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 카운팅 배열의 1에는 A인 사람의 수가, 2에는 B가, 3에는 C가, 4에는 D가 들어감
        int[] countArr = new int[5];
        // type num = 분류 번호
        int typeNum = 0;
        char s;
        int t;

        // s와 t를 입력받은 후 카운팅 배열을 통해 각각의 빈도 저장
        for(int i = 0; i < 3; i++) {
            s = sc.next().charAt(0);
            t = sc.nextInt();

            if(t >= 37 && s == 'Y')
                typeNum = 1;
            else if(t >= 37)
                typeNum = 2;
            else if(s == 'Y')
                typeNum = 3;
            else
                typeNum = 4;
            countArr[typeNum]++;
        }

        // A부터 D까지 나온 횟수를 출력
        for(int i = 1; i <= 4; i++) {
            System.out.print(countArr[i] + " ");
        }
        
        if(countArr[1] >= 2)
            System.out.print("E");
    }
}
