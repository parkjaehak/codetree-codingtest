import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사용자 입력 받기 (a일 b시 c분)
        int a = sc.nextInt(); // 종료 날짜 (11월 a일)
        int b = sc.nextInt(); // 종료 시간 (b시)
        int c = sc.nextInt(); // 종료 분 (c분)
        
        sc.close(); // 입력 종료

        // 시작 시간: 2011-11-11 11:11
        int startDay = 11, startHour = 11, startMinute = 11;

        // 날짜 차이 계산 (1일 = 1440분)
        int dayDifference = (a - startDay) * 1440;

        // 시간 차이 계산 (1시간 = 60분)
        int hourDifference = (b - startHour) * 60;

        // 분 차이 계산
        int minuteDifference = (c - startMinute);

        // 총 경과 시간 (분 단위)
        int totalMinutes = dayDifference + hourDifference + minuteDifference;

        // 만약 입력된 시간이 시작 시간보다 이전이면 -1 출력
        if (a < startDay || (a == startDay && b < startHour) || (a == startDay && b == startHour && c < startMinute)) {
            System.out.println("-1");
        } else {
            System.out.println(totalMinutes);
        }
    }
}
