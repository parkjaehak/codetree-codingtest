import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int cnt = 0;
        int i = 0;

        int i = 0;        // 현재 탐색 위치
        int count = 0;    // 설치된 와이파이 수

        while (i < n) {
            if (arr[i] == 0) {
                // 사람이 없으면 다음으로 넘어감
                i++;
                continue;
            }

            // 사람이 있다면, 이 사람을 커버할 수 있는 가장 오른쪽 위치에 와이파이 설치
            int install = Math.min(n - 1, i + m); // 오른쪽 끝 넘어가면 안 됨

            // 왼쪽 끝은 i까지, 오른쪽으로 가며 설치 가능한 위치 찾기
            // 굳이 조건 검사할 필요 없음: 어디든 설치 가능하니까
            count++; // 와이파이 하나 설치
            i = install + m + 1; // 이 와이파이가 커버하는 범위를 모두 건너뜀
        }

        System.out.println(count);
    }
}

