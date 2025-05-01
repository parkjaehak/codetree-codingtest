import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 1~12월 일수
    static String[] weekdays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};


    public static void main(String[] args) {
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        //m1, d1이 월요일이라면 m2 d2는 어떤 요일일까
        //두 날짜 사이의 총 일수를 계산한다.
        int difference = 0;

        if (m1 == m2) {
            difference = d2 - d1;
        } else if (m1 < m2) {
            difference += daysInMonth[m1] - d1; // 첫 달 남은 일수
            for (int i = m1 + 1; i < m2; i++) {
                difference += daysInMonth[i]; // 중간 달의 전체 일수
            }
            difference += d2; // 마지막 달의 일수
        } else { // m1 > m2일 때
            difference -= (daysInMonth[m2] - d2); // 두 번째 달에서 남은 일수를 빼기
            for (int i = m2 + 1; i < m1; i++) {
                difference -= daysInMonth[i]; // 중간 달들의 전체 일수 빼기
            }
            difference -= (d1); // 첫 번째 달의 일수를 빼기
        }

        // 요일 계산 (음수 방지)
        int index = (difference % 7 + 7) % 7;
        System.out.println(weekdays[index]);
    }
}