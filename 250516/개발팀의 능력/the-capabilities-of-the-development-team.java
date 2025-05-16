import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }

        //2, 2, 1
  
        //3팀의 증 최대와 최소의 차이
        //5명중 2명, 1명을 고른다.
      
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 5; j++){
                for(int k = 0; k < 5; k++){
                    if(k == i || k == j){
                        continue;
                    }

                    //모든 팀의 능력치가 서로 다르게 팀을 묶어야 한다.
                    int sum1 = ability[i] + ability[j];
                    int sum2 = ability[k];
                    int sum3 = total - sum1 - sum2;

                    if(sum1 == sum2 || sum2 == sum3 || sum1 == sum3){
                        continue;
                    }

                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;

                    max = Math.max(sum1, Math.max(sum2,sum3));
                    min = Math.min(sum1, Math.min(sum2, sum3));

                        
                    result = Math.min(Math.abs(max - min), result);

                }
                         
            }
        }

        if(result == Integer.MAX_VALUE){
            System.out.print(-1);
        }else{
            System.out.print(result);
        }
      
    
    }
}