import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int count = 0;


        for(int k = 1; k <= n; k++){
            for(int i = 0; i < n - k + 1; i++){
                //k만큼 선택한다
                int sum = 0;
                int avg = 0;
                for(int j = i; j < i + k; j++){
                    sum += arr[j];
                }
                
                // 평균이 정수가 아니면 건너뜀
                if (sum % k != 0) continue;
                avg = sum / k;

                for(int j = i; j < i + k; j++){
                    if(avg == arr[j]){
                       count++;
                       break; //하나라도 같으면 종료 
                    }
                    
                }
            }   
        } 

        System.out.print(count);     
    }
}