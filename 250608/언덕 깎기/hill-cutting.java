import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
   
        Arrays.sort(arr);

        //ex) 1 4 20 21 24

        // 1. 가능한 높이 구간을 모두 시도한다.
        // 2. 각 구간마다 모든 언덕을 해당 범위 내로 맞추는 비용을 계산한다.
        // 3. 최소 비용을 저장한다

        //high = low + 17
        //결국 최소비용은 높이차가 17로 나도록 하는게 좋음
        //그 이하로 나게 되면 결국 언덕을 높이거나 낮춰야 하는 비용이 더 들기 때문ㅇ

        //min = 1, max = 24
        //low, high -> 1, 18  2, 19 ..... 7, 24 까지의 범위 중에서 모든 값들이 해당 범위가 되도록 만드는 비용 계산

        int min = arr[0];
        int max = arr[n - 1];
        
        int minValue = Integer.MAX_VALUE;
        for(int low = min; low <= max - 17; low++){
            int high = low + 17;
            int cost = 0;

            for(int i = 0; i < n; i++){
                if(arr[i] < low){
                    //기준보다 작으면 올리고
                    cost += Math.pow(low - arr[i], 2);

                }else if(arr[i] > high){
                    //기준보다 크면 깎는다
                    cost += Math.pow(arr[i] - high, 2);
                }
            }
            minValue = Math.min(minValue, cost);
        }

        System.out.print(minValue);


    }
}