import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[] dp;
    static Info[] infos;

    public static void main(String[] args) throws Exception {
        N = Integer.parseInt(br.readLine());

        infos = new Info[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int profit = Integer.parseInt(st.nextToken());
            infos[i] = new Info(start, end, profit);
        }

        // 끝나는 날짜 기준으로 정렬
        Arrays.sort(infos, Comparator.comparingInt(info -> info.end));


        // DP 배열 초기화
        dp = new int[N];
        dp[0] = infos[0].profit; //첫 알바의 이익

        for (int i = 1; i < N; i++) {
            //현재 알바의 이익
            int currProfit = infos[i].profit;

            int index = binarySearch(i); //현재 알바와 가장 가까운 이전 알바를 찾는다.
            if(index != -1){
                currProfit += dp[index];
            }
            dp[i] = Math.max(dp[i - 1], currProfit); //현재 알바를 선택하지 않는 것과 선택하는 것 중 더 큰 것을 선택한다.
        }
        System.out.print(dp[N - 1]);
    }

    static int binarySearch(int index){
        int low = 0;
        int high = index - 1;

        while(low <= high){
            int mid = (low + high) / 2;
            
            //현재 인덱스의 시작점보다 이전 인덱스의 끝점이 작아야한다.
            if(infos[mid].end < infos[index].start){
                if(infos[mid + 1].end < infos[index].start){
                    low = mid + 1; //여전히 작다면 low를 변경
                }else{
                    return mid; //그때의 중간값을 반환한다. (가장 가까운 이전 값이기 때문)
                }
            }else{
                high = mid - 1; //만약 현재 시작점이 이전의 끝점보다 작거나 같다면
            }
        }
        return -1; //알바를 찾지 못했을 경우
    }


    static class Info {
        int start, end, profit;

        Info(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }
}
