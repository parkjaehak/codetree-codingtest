import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();
        int[] B = new int[M];
        for (int i = 0; i < M; i++)
            B[i] = sc.nextInt();
        // Please write your code here.




        int count = 0;
          // B 수열의 빈도 저장
        Map<Integer, Integer> bCount = new HashMap<>();
        for (int b : B) {
            bCount.put(b, bCount.getOrDefault(b, 0) + 1);
        }

        for(int i = 0; i < N - M + 1; i++){
            Map<Integer, Integer> result = new HashMap<>();
            for(int j = i; j < i + M; j++){
                //선택한 부분 수열의 원소와 B수열이 일치하면 count 증가
                result.put(A[j], result.getOrDefault(A[j], 0) + 1);
            }

            if (result.equals(bCount)) {
                count++;
            }

        }

        System.out.print(count);

    }
}