import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int suffixLength = 1;
        //수열 뒤에서부터 오름차순 정렬된 가장 긴 구간 
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                suffixLength++;
            } else {
                break;
            }
        }

        int answer = n - suffixLength;
        System.out.println(answer);
    }
}
