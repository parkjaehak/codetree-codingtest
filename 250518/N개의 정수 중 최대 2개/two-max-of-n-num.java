import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언:
        int[] A = new int[100];
        int n = 0, max1 = 0, max2 = 0;

        // 입력:
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        
        // Step 1: 처음 2개의 원소 중 더 큰 값을 max1에
        //                        더 작은 값을 max2에 넣습니다.
        if (A[0] > A[1]){
            max1 = A[0];
            max2 = A[1];
        }
        else{
            max1 = A[1];
            max2 = A[0];
        }

        // Step 2: 3번째 원소부터 보면서 max1과 max2를 갱신합니다.
        for (int i = 2; i < n; i++) {
            if (A[i] >= max1) {
                // Case 1: 지금까지 본 숫자들보다 좋다면
                //         max2, max1 모두 갱신해줍니다.
                max2 = max1;
                max1 = A[i];
            } 
            else if (A[i] > max2){
                // Case 2: max2보다만 좋다면 max2를 갱신합니다.
                max2 = A[i];
            }
        }
        
        // 출력: 
        System.out.print(max1 + " " + max2);
    }
}
