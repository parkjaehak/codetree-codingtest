import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.


        Map<Integer, Integer> countMap = new HashMap<>();
        //ai, k, aj 가 등차수열을 이루는 횟수의 최대값 구하기
        for(int i = 0; i < n; i++){
            //모든 쌍을 구한다
            //중간값 k를 계산한다
            for(int j = i + 1; j < n; j++){
                int sum = arr[i] + arr[j];
                if(sum % 2 != 0){
                    continue; //정수이어야한다 
                }
                int k = sum / 2;
                countMap.put(k, countMap.getOrDefault(k, 0) + 1);
            }

        }
        int maxCount = 0;
            for(int count : countMap.values()){
                maxCount = Math.max(maxCount, count);
            }

          System.out.println(maxCount);
    }
}
