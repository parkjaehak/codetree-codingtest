import java.util.*;
public class Main {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        // Please write your code here.
        //H 점수: H 이상인 수의 개수가 H개 이상을 만족하는 H중 최댓값
        //2,3,5 수열의 H는 2
        //2이상인 수의 개수가 2개 이상


        //정렬 후 큰 수부터 차례로 H 수인지 체크한다.
        //먼저 1개를 랜덤하게 더한다.

        Arrays.sort(a);


        int left = 0, right = n;
        //가능한 H를 선택한다.
        int result = 0;
        while(left <= right){
            int mid = (left + right) / 2;

            if(canH(a, l, mid)){
                result = mid;
                left = mid + 1;
                //더 높은 수로 좁혀간다.
            }else{
                right = mid - 1;
                //더 낮은 수로 좁혀간다.
            }
        }

        System.out.print(result);

    }

    static boolean canH(int[]a, int l, int h){
        //H가 될 수 있는 지 확인한다.
        int count = 0; 
        int needs = 0; //몇 개 1을 올릴 것인가 (최대 l개 가능하다)

        for(int i = n - 1; i >= 0; i--){
            if(a[i] >= h){
                count++;
            }else if(a[i] + 1 >= h){
                //1을 더했을때 h이상이 된다면 올려서 h개 이상을 만족하는데 도움을 준다.
                needs++;
                count++;
            }

            if(count >= h){
                //h이상이면 종료시킨다.
                break;
            }
        }

        return (count >= h) && (needs <= l);
    }
}