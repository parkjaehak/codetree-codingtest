import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();

        // 변환
        String encoded = "";

        // 입력의 첫번째 값을 읽고 초기화합니다.
        char currChar = A.charAt(0);
        int numChar = 1;
        for(int i = 1; i < A.length(); i++){
            if(A.charAt(i) == currChar){
                // 지금까지의 문자와 같으면 연속된 문자 개수만 추가해 주고 넘어갑니다.
                numChar++;
            }
            else {
                // 지금까지의 문자와 다르면 새로운 문자로 바꿔줘야 합니다.
                // 지금까지 세어온 currChar와 numChar를 기록합니다.
                encoded += currChar;
                encoded += Integer.toString(numChar);
                // currChar와 numChar를 현재 값으로 초기화합니다.
                currChar = A.charAt(i);
                numChar = 1;
            }
        }
        // 마지막 덩어리에 해당하는 currChar와 numChar를 기록합니다.
        encoded += currChar;
        encoded += Integer.toString(numChar);

        System.out.println(encoded.length());
        System.out.println(encoded);
    }
}
