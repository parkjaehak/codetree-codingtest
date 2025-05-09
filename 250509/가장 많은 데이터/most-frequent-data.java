import java.util.Scanner;
import java.util.HashMap;

public class Main {    
    public static final int MAX_N = 100000;
    
    // 변수 선언
    public static int n;
    public static String[] words = new String[MAX_N];
    public static HashMap<String, Integer> freq = new HashMap<>();
    
    public static int ans; // 가장 많이 나온 횟수를 기록합니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();

        for(int i = 0; i < n; i++)
            words[i] = sc.next();
        
        // 각 문자열이 몇 번씩 나왔는지를
        // hashmap에 기록해줍니다.
        for(int i = 0; i < n; i++) {
            // 처음 나온 문자열이라면 1을 직접 적어줘야 합니다.
            if(!freq.containsKey(words[i]))
                freq.put(words[i], 1);
            // 이미 나와있던 문자열이라면 1을 더해줍니다.
            else
                freq.put(words[i], freq.get(words[i]) + 1);
            
            // 최댓값을 갱신합니다.
            ans = Math.max(ans, freq.get(words[i]));
        }

        System.out.print(ans);
    }
}
