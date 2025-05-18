import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열을 구현합니다.
        int[] arr = new int[10];
        
        // 10개의 정수를 입력받습니다.
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxVal = arr[0];
        
        // 10개의 숫자들 중 최댓값을 구합니다.
        for(int i = 1; i < 10; i++) {
            if(arr[i] > maxVal)
                maxVal = arr[i];
        }
        
        // 최댓값을 출력합니다.
        System.out.println(maxVal);
    }
}
