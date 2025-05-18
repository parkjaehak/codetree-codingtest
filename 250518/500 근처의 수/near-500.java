import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열을 구현합니다.
        int[] arr = new int[10];

        // 10개의 정수를 입력받습니다.
        for(int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
        
        // maxVal : 500 미만의 가장 큰 수, minVal : 500 초과의 가장 작은 수
        int maxVal = 1;
        int minVal = 1000;
        
        // 10개의 숫자들 중 500근처의 수들을 구합니다.
        for(int i = 0; i < 10; i++) {
            if(arr[i] < 500 && arr[i] > maxVal)
                maxVal = arr[i];
            
            if(arr[i] > 500 && arr[i] < minVal)
                minVal = arr[i];
        }
        
        // 구한 값을 출력합니다.
        System.out.print(maxVal + " " + minVal);
    }
}
