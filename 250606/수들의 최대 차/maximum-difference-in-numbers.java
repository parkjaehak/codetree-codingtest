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

        //뽑을 수 있는 최대 숫자의 개수
        //최대 - 최소 는 k를 넘지 않아야한다.
        //최대 최소의 차가 k를 넘지 않는 모든 경우를 고려한다.

        int max = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                //서로다른 두 수를 고른다
                int a = arr[i];
                int b = arr[j];
                int maxV = Math.max(a, b);
                int minV = Math.min(a,b);
                if(maxV - minV > k){
                    continue;
                }

                //k를 넘지 않는다면 이제 이 사이에 존재하는 모든 원소를 구한다.
                int count = 0;
                for(int l = 0; l < n; l++){
                    if(maxV >= arr[l] && minV <= arr[l]){
                        //이 사이에 있다면 
                        count++;
                    }
                }

                max = Math.max(count, max);
            }
        }

        System.out.print(max);
    }
}