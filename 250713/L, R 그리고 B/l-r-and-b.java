import java.util.*;
public class Main {
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] map = new char[10][10];
        boolean[][] visited = new boolean[10][10];

        int startX = 0, startY = 0, endX = 0, endY = 0;
    

        for (int i = 0; i < 10; i++) {
            String line = sc.next();
            for (int j = 0; j < 10; j++) {
                map[j][i] = line.charAt(j);

                if (map[j][i] == 'L') {
                    startX = i;
                    startY = j;
                } else if (map[j][i] == 'B') {
                    endX = i;
                    endY = j;
                }
                //시작과 끝 지점 위치 파악

            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0}); //최단거리 
        visited[startY][startX] = true;

        int answer = -1;

        while(!queue.isEmpty()){
            int []curr = queue.poll();
            int y = curr[1];
            int x = curr[0];
            int dist = curr[2];

            if(x == endX && y == endY){
                answer = dist - 1;
                break;
            }

            for(int d = 0; d < 4; d++){
                int ny = y + dy[d];
                int nx = x + dx[d];

                if(ny < 0 || ny >= 10 || nx < 0 || nx >= 10 || visited[ny][nx] || map[ny][nx] == 'R'){
                    continue;
                }

                visited[ny][nx] = true;
                queue.add(new int[]{nx, ny, dist + 1});
            }

        }

        System.out.print(answer);
    }
}