import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수 n과 q을 입력받습니다.
	    int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[100];

        // arr를 입력받습니다.
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // q개의 질의를 수행합니다.
        for(int i = 0; i < q; i++) {
            // 몇번째 질의인지 확인합니다.
            int qType = sc.nextInt();
            
            if(qType == 1) {
                // a를 입력받은 후, a번째 원소를 출력합니다.
                int a = sc.nextInt();
                
                // a번째 원소를 출력합니다.
                System.out.println(arr[a - 1]);
            }
            else if(qType == 2) {
                // a를 입력받은 후, 배열에 숫자 a가 있다면 가장 index가 작은 원소가 몇번째인지 출력합니다. 없다면 0을 출력합니다.
                int a = sc.nextInt();
                
                // 가장 index가 작은 원소에 있는 숫자 a를 찾습니다.
                int idx = -1;
                for(int j = 0; j < n; j++) {
                    if(arr[j] == a) {
                        idx = j;
                        break;
                    }
                }
                
                // 숫자 a가 몇번째인지 출력합니다. 없다면 0을 출력합니다.
                System.out.println(idx + 1);
            }
            else {
                // a, b를 입력받은 후, a번째 원소부터 b번째 원소까지 공백을 사이에 두고 출력합니다.
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                // a번째 원소부터 b번째 원소까지 공백을 사이에 두고 출력합니다.
                for(int j = a - 1; j < b; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }
    }
}
