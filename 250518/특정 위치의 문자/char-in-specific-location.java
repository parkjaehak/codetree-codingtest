import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열을 만들고 문자 a를 입력받습니다.
        char[] word = new char[]{ 'L', 'E', 'B', 'R', 'O', 'S' };
        char a = sc.next().charAt(0);

        // idx : a와 같은 문자의 인덱스, a와 같은 것이 없으면 -1
        int idx = -1;
        
        // a와 같은 문자가 있는지 확인합니다.
        for(int i = 0; i < 6; i++) {
            if(word[i] == a)
                idx = i;
        }
        
        // 같은 것이 없으면 None을, 있다면 그 인덱스를 출력합니다.
        if(idx == -1)
            System.out.print("None");
        else
            System.out.print(idx);

    }
}
