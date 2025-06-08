import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    
    public static int n, l;
    public static int[] a = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        l = sc.nextInt();
        
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        // 모든 답을 일일히 가정해 봅니다.
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            // 정답이 i일 때 가능한지 판단합니다.

            // i - 1인 값은 최대 l개까지 i로 올릴 수 있습니다.
            // cnt : i이상인 숫자의 개수(i - 1인 숫자는 l개까지 카운트)
            // cntl : 지금까지 1 증가시킨 숫자의 개수
            int cnt = 0;
            int cntl = 0;

            for(int j = 0; j < n; j++) {
                if(a[j] >= i)
                    cnt++;
                else if(a[j] == i - 1)
                    if(cntl < l) {
                        cntl++;
                        cnt++;
                    }
            }

            if(cnt >= i)
                ans = i;
        }

        System.out.print(ans);
    }
}
