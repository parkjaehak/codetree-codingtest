import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 학생 수 n 입력받기
        int n = sc.nextInt();

        // 통과한 사람의 수를 나타내는 변수 : passPeople
        int passPeople = 0;

        for(int i = 0; i < n; i++) {
            // 정수 배열 선언
            int[] arr = new int[4];
            int sum = 0;

            // 4개의 정수를 배열에 입력받아 저장합니다.
            for(int j = 0; j < 4; j++) {
                arr[j] = sc.nextInt();
            }

            // 4과목의 점수의 합을 구합니다.
            for(int j = 0; j < 4; j++) {
                sum += arr[j];
            }
            
            // 평균을 구합니다.
            double avg = (double)sum / 4;

            //출력
            if(avg >= 60) {
                System.out.println("pass");
                passPeople++;
            }
            else
                System.out.println("fail");
        }

        // 통과한 사람의 수 출력
        System.out.println(passPeople);
    }
}
