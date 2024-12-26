import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int N;


    public static void main(String[] args) {
        N = sc.nextInt();

        // +1, -1, /2, /3
        int result = bfs();
        System.out.println(result);
    }

    static int bfs(){
        //현재 값, 연산 횟수
        Queue<int[]> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>(); // 방문 여부를 동적 자료구조로 관리한다.

        q.add(new int[]{N, 0});
        visited.add(N);

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int num = curr[0];
            int count = curr[1];

            if(num == 1){
                return count;
            }

            if(num - 1 > 0 && !visited.contains(num - 1)){
                visited.add(num - 1);
                q.add(new int[]{num - 1, count + 1});
            }
            if(num + 1 < 1000000 && !visited.contains(num + 1)){
                visited.add(num + 1);
                q.add(new int[]{num + 1, count + 1});
            }
            if(num % 2 == 0 && !visited.contains(num / 2)){
                visited.add(num / 2);
                q.add(new int[]{num / 2, count + 1});
            }
            if(num % 3 == 0 && !visited.contains(num / 3)){
                visited.add(num / 3);
                q.add(new int[]{num / 3, count + 1});
            }
        }
        return -1;
    }
}