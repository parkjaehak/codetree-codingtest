import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.

        //0~n-1번방에 arr[i] 명의 사람이 들어가야한다


        int min = Integer.MAX_VALUE;
       
        for(int i = 0; i < n; i++){
            //시작할 방을 선택한다.
            int start = i;
            int currNum = arr[i];
            int sum = 0;
            for(int j = 0; j < n; j++){
                if(i == j){
                    continue;
                }
                //무조건 반시계로 이동한다. 선택칸이 2이고 1가지 이동한 거리는 1이 아닌 4이다.
                int distance = 0;
                if(j > i){
                    distance = j - i;
                }else if(j < i){
                    distance = n - (i + 1) + (j + 1);
                }
                sum += arr[j] * distance;
            }

            min = Math.min(sum, min);

        }

        System.out.print(min);
    }
}