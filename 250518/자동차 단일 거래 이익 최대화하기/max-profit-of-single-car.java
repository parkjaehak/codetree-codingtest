import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언:
        int n;
        int[] price = new int[MAX_NUM];

        // 입력:
        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            price[i] = sc.nextInt();

        // 배열을 앞에서부터 순회하며 사는 시점의 후보를 선택합니다
        int maxProfit = 0;
        for(int i = 0; i < n; i++) {
            // 사는 시점의 다음 해부터 순회하며 파는 시점의 후보를 선택합니다
            for(int j = i + 1; j < n; j++) {
                int profit = price[j] - price[i];
                
                if(profit > maxProfit)
                    maxProfit = profit;
            }
        }

        System.out.print(maxProfit);
    }
}
