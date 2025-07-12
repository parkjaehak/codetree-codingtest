import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        // Please write your code here.

        //인접 위치 바꾸는 최소 횟수
        int swapCount = 0;

        //알파벳 순서를 정렬한 리스트를 만든다.

        //버블 정렬을 이용해 오름차순으로 만들되, swap할 때마다 count한다.
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(arr[j] > arr[j + 1]){
                    char temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                    swapCount++;
                }
            }
        }

        //마지막에 count 출력.
        System.out.print(swapCount);



    }
}