import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        //각 점을 뺀 모든 상황을 고려

        int area = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            //i번 점을 제외한 모든 점들에 대해
            //최소 직사각형 넓이 구하기
            //최소 x 최대 x, 최소 y 최대 y

      int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
      int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;


            for(int j = 0; j < N; j++){
                if(i == j){
                    continue;
                }
                minX = Math.min(minX, x[j]);
                maxX = Math.max(maxX, x[j]);
                minY = Math.min(minY, y[j]);
                maxY = Math.max(maxY, y[j]);
            }

              // 가능한 직사각형 넓이 중 최솟값을 업데이트
            area = Math.min(area, (maxX - minX) * (maxY - minY));

        }
        System.out.print(area);
    }
}