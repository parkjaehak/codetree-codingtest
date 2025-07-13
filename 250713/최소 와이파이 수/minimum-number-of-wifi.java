import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); //m거리 이내 사용가능
        int[] arr = new int[n ];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        int count = 0;
        int i = 0;

        while (i < n) {
            if (arr[i] == 1) {
                // 와이파이 설치 가능한 범위: [i, i + m]
                int install = Math.min(n - 1, i + m);
                int leftLimit = Math.max(0, i);
                boolean found = false;

                // 뒤에서부터 탐색 (그리디: 최대 오른쪽에 설치)
                while (install >= leftLimit) {
                    if (true) {  // 설치 가능한 조건 (항상 정수 좌표 가능)
                        count++;
                        i = install + m + 1;
                        found = true;
                        break;
                    }
                    install--;
                }

                if (!found) {
                    System.out.println(-1);
                    return;
                }
            } else {
                i++;
            }
        }

        System.out.println(count);
    }
}