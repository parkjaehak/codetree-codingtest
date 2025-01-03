import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static int maxSum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        //백트래킹을 활용한 분할 탐색
        backtrack(0, 0, 0, 0);
        System.out.println(maxSum);
    }
    
    static void backtrack(int index, int sumA, int sumB, int sumC) {
        if (index == n) {
            //A와 B의 합이 같다면 최대 합을 갱신
            if (sumA == sumB) {
                maxSum = Math.max(maxSum, sumA);
            }
            return;
        }
        
        // 현재 숫자를 A 그룹에 넣기
        backtrack(index + 1, sumA + arr[index], sumB, sumC);
        // 현재 숫자를 B 그룹에 넣기
        backtrack(index + 1, sumA, sumB + arr[index], sumC);
        // 현재 숫자를 C 그룹에 넣기
        backtrack(index + 1, sumA, sumB, sumC + arr[index]);
    }
}
