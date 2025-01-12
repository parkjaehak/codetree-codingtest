import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 명령 개수 입력
        int n = sc.nextInt();
        sc.nextLine();
        
        // 좌표를 기록할 Set 사용 (좌표를 1D로 저장)
        Set<Integer> visited = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();
        
        // 초기 위치
        int position = 0;
        visited.add(position);  // 시작 위치도 지나간 곳에 포함
        
        // 명령 처리
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int x = Integer.parseInt(command[0]);
            String direction = command[1];
            
            // 해당 명령을 x번만큼 처리
            for (int j = 0; j < x; j++) {
                if (direction.equals("L")) {
                    position--;  // 왼쪽으로 이동
                } else if (direction.equals("R")) {
                    position++;  // 오른쪽으로 이동
                }
                
                // 이미 지나간 좌표는 repeated에 추가
                if (!visited.add(position)) {
                    repeated.add(position);
                }
            }
        }
        
        // 두 번 이상 지나간 영역의 크기 출력
        System.out.println(repeated.size() - 1);
    }
}
