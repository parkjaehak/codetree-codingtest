import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int []array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        Arrays.sort(array);


        // Please write your code here.
        //연속된 숫자가 되도록 하기 위한 최소 이동 횟수

        //연속된 수가 되려면 두 구간의 간격이 1이어야한다.
        //두 간격이 모두 1이면: 0회

        //한 쪽 간격이 2 이상이면:
        //간격이 2이면 1회(즉, (a, b, c) = (x, x+2, x+3)일 때, x+2를 x+1로 이동시키면 연속)
        //간격이 3 이상이면 2회(한 번씩 줄여야 하므로)


        int high = array[2];
        int low = array[0];
        int mid = array[1];
    
    
        int left_gap = mid - low;
        int right_gap = high - mid;

        int moveCount = 0;
        //이미 연속인 경우
        if(left_gap == 1 && right_gap == 1){
            moveCount = 0;
        }else if(left_gap == 2 || right_gap == 2){
            //한 번 움직여 연속이 되는 경우
            moveCount = 1;
        }else{
            //두 번 필요한 경우 (아무리 멀어도 두 번만에 연속된 수를 만들 수 있음)
            moveCount = 2;
        }

       
      System.out.print(moveCount);
        
    }
}