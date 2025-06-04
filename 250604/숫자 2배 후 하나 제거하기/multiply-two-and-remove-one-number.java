import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        //인접한 숫자간의 차의 합이 최소
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            arr[i] = arr[i] * 2;
            
            for(int j = 0; j < n; j++){
                //하나를 제거한다.
                
                List<Integer> selected = new ArrayList<>();
                for(int k = 0; k < n; k++){
                    if(k == j){
                        continue;
                    }
                    selected.add(arr[k]);
                }
                
                int sum = 0;
                for (int l = 0; l < selected.size()- 1; l++) {
                    sum += Math.abs(selected.get(l) - selected.get(l + 1));
                }

                min = Math.min(min, sum);
            }
            arr[i] /= 2;
        }

        System.out.print(min);
    }
}