import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n개의 폭탄
        int k = sc.nextInt();
        int[] bombs = new int[n]; //n개의 폭탄 번호
        int[] nums = new int[1000001]; //터진 폭탄의 번호별 수 
        boolean [] explode = new boolean[n]; //터진 여부 

        for (int i = 0; i < n; i++)
            bombs[i] = sc.nextInt();
        // Please write your code here.
        //같은 정수의 거리가 k보다 같거나 작으면 폭발
        //가장 많이 터진 폭탄의 정수


        int max = 1;
        int maxidx = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                //터질 폭탄을 선택한다.
                if(j - i > k){
                    //거리가 k를 넘으면 종료한다.
                    break;
                }

                if(bombs[i] != bombs[j]){
                    //두 번호가 다르면 터지지 않는다.
                    continue;
                }

                if(explode[i] == false){
                    nums[bombs[i]]++; //폭탄을 터뜨린다.
                    explode[i] = true; 
                }
                if(explode[j] == false){
                    nums[bombs[j]]++;
                    explode[j] = true; //7 2 4 2 2 4라고 할때 2 세개가 터진다.
                }      
            }
        }

        for(int i = 0; i <= 1000000; i++){
            if(max <= nums[i]){
                max = nums[i];
                maxidx = i; //터지는 폭탄의 최대 개수와 이때의 폭탄 번호를 구한다.
            }
        }

        System.out.print(maxidx);

    }
}