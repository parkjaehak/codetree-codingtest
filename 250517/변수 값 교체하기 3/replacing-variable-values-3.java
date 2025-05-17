public class Main {
    public static void main(String[] args) {
        // 변수 선언
        int a = 3, b = 5;

        // 교체
        int temp = a;
        a = b;
        b = temp;

        // 출력
        System.out.println(a);
        System.out.println(b);
    }
}
