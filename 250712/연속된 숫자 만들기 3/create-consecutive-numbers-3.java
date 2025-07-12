import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int []array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;

        Arrays.sort(array);

        //이번엔 최대 이동 횟수

        //a b c가 있을때 b 바로 앞으로만 이동하면 됨

        int high = array[2];
        int mid = array[1];
        int low = array[0];

        int left_dist = mid - low;
        int right_dist = high - mid;

        int moveCount = 0;
        while(true){
            if(left_dist == 1 && right_dist == 1){
                break;
            }

            if(left_dist >= 2 || right_dist >= 2){
                if(left_dist >= right_dist){
                    int temp = mid - 1;
                    high = mid;
                    mid = temp;
                    moveCount++;


                }else{
                    int temp2 = mid + 1;
                    low = mid;
                    mid = temp2;
                    moveCount++;

                }
                left_dist = mid - low;
                right_dist = high - mid;
            }

        }


        System.out.print(moveCount);

    }
}