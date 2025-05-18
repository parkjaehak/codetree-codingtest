import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int[] A = new int[100];
        int n;

        // 입력:
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        
        // 초기값을 적습니다. 최소가 될 첫 번째 후보입니다.
        int min = A[0];
        
        // 최솟값의 개수를 저장할 변수입니다.
        int cnt = 0;

        // 나머지 원소들을 보며 최솟값을 갱신합니다.
        for (int i = 1; i < n; i++){
            if (min > A[i]){ // 지금까지 나왔던 값들 보다 더 작은 값이라면
                min = A[i];  // 최솟값이 되므로 그 값을 갱신합니다.
            } 
        }
        
        // min과 일치하는 원소의 개수를 셉니다.
        for (int i = 0; i < n; i++) {
            if (A[i] == min) {
                cnt++;
            }
        }

        // 출력:
        System.out.println(min + " " + cnt);
    }
}
