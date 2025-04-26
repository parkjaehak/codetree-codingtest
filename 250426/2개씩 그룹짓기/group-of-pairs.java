import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.

        //그룹을 만들고
        //각 그룹의 원소의 합을 구한다
        //합의 경우 최댓값이 최소가 되도록 한다.

        Arrays.sort(nums);
        //1 2 3 5 7 8   
       // -> 7 2, 3 5, 1 8

        //1 2, 3 4 ,5 6, 7 8

        //위치를 바꿔야 함
      
        for(int i = 0; i < n; i += 2){
            int temp = nums[i];
            nums[i] = nums[n * 2 - (i + 1) - 1];
            nums[n * 2 - (i + 1) - 1] = temp;
        }

        int max = 0;

              
        for(int i = 0; i < n; i += 2){
           max = Math.max(max, nums[i] + nums[i + 1]);
        }
        System.out.print(max);
   
    }
}