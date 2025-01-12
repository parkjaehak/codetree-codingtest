import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 명령의 수 n
        int n = sc.nextInt();
        sc.nextLine();  // 버퍼에 남은 개행문자를 제거

        // 현재 위치
        int position = 0;
        // 지나간 구간을 기록할 Set
        Set<String> visitedSegments = new HashSet<>();
        // 2번 이상 지나간 구간을 기록할 Set
        Set<String> passedTwiceSegments = new HashSet<>();

        // 명령 수행
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int x = Integer.parseInt(command[0]);
            String direction = command[1];

            // 방향에 따라 이동
            for (int j = 0; j < x; j++) {
                int prevPosition = position;
                if (direction.equals("L")) {
                    position--;
                } else {
                    position++;
                }

                // 지나간 구간을 "작은 좌표 -> 큰 좌표" 순으로 기록
                String segment = Math.min(prevPosition, position) + "->" + Math.max(prevPosition, position);
                if (!visitedSegments.add(segment)) {
                    passedTwiceSegments.add(segment);
                }
            }
        }

        // 2번 이상 지나간 구간의 수 출력
        System.out.println(passedTwiceSegments.size());
    }
}
