import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.


        //거쳐간 돌 중 최댓값이 최소가 되도록 하자
        //최댓값을 가정하자
        //인접한 돌 사이 거리가 전부 k 이내인지 살펴보자
        int max = Math.max(arr[0], arr[n - 1]); //가정한 max

        for(int i = max; i <= 100; i++){
            boolean isPossible = true;

            int limit = i;
            int lastIndex = 0; //마지막 index로부터 limit을 넘지 않고 k이내로 이동가능한지 판단한다.
            for(int j = 1; j <= n - 1; j++){ //1번돌부터 n번돌까지
                if(arr[j] <= limit){
                    if(j - lastIndex > k){
                        //다음 칸이 k이내
                        isPossible = false;
                    }
                    lastIndex = j;
                }
            }

            if(isPossible){
                System.out.print(i);
                return;
            }
        }
            


    }
}