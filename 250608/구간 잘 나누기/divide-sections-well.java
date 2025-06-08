import java.util.Scanner;
public class Main {
    static int []nums;
    static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        nums = new int[n];

        int max = 0, sum = 0;

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            max = Math.max(max, nums[i]);
            sum += nums[i];

        }

        //어떤 값을 최댓값으로 정했을 때 → 그 값 이하로 M개의 구간으로 나눌 수 있는지?
        int left = max, right = sum, answer = sum;

        while(true){
            if(left > right){
                break;
            }
            int mid = (left + right) / 2;
            if(isPossible(mid)){
                answer = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        
        System.out.println(answer);
    }

    //중간값 mid를 구간의 최댓값 후보라고 가정한다.
    //이 값 이하로 M개의 구간으로 나눌수 있는가?
    //mid는 구간합의 최댓값 후보


    static boolean isPossible(int limit){

        int count = 1;
        int sum = 0;

        for(int i = 0; i < n; i++){
            //n개의 수 검사
            if(sum + nums[i] > limit){
                count++;
                sum = nums[i];
            }else{
                sum += nums[i];
            }
        }

        if(count <= m){
            return true;
        }else{
            return false;
        }

    }
}