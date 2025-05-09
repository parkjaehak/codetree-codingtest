import java.util.Scanner;
import java.util.HashMap;

public class Main {    
    public static final int MAX_N = 100000;
    
    // 변수 선언
    public static int n, m;
    public static int[] arr = new int[MAX_N];
    public static HashMap<Integer, Integer> freq = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // 각 숫자가 몇 번씩 나왔는지를
        // hashmap에 기록해줍니다.
        for(int i = 0; i < n; i++) {
            // 처음 나온 숫자라면 1을 직접 적어줘야 합니다.
            if(!freq.containsKey(arr[i]))
                freq.put(arr[i], 1);
            // 이미 나와있던 숫자라면 1을 더해줍니다.
            else
                freq.put(arr[i], freq.get(arr[i]) + 1);
        }

        // m개의 질의에 대해
        // 몇 번씩 나왔는지를 출력합니다.
        for(int i = 0; i < m; i++) {
            int num = sc.nextInt();

            // 처음 나온 숫자라면 0을 출력합니다.
            if(!freq.containsKey(num))
                System.out.print(0 + " ");
            // 나온 적이 있는 숫자라면, 빈도수를 출력해줍니다.
            else
                System.out.print(freq.get(num) + " ");
        }
    }
}
