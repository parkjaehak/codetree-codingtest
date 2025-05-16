import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ability = new int[6];
        int total = 0;
        for (int i = 0; i < 6; i++) {
            ability[i] = sc.nextInt();
            total += ability[i];
        }
        // Please write your code here.



         // Please write your code here.
        //3팀의 증 최대와 최소의 차이
        //6명중 2명만 고른다.
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 6; j++){
                for(int k = 0; k < 5; k++){
                    for(int l = k + 1; l < 6; l++){
                        if(k == i || k == j || l == i || l == j){
                            continue;
                        }
                        int sum1 = ability[i] + ability[j];
                        int sum2 = ability[k] + ability[l];
                        int sum3 = total - sum1 - sum2;

                        int max = Integer.MIN_VALUE;
                        int min = Integer.MAX_VALUE;

                        max = Math.max(sum1, Math.max(sum2,sum3));
                        min = Math.min(sum1, Math.min(sum2, sum3));

                        
                        result = Math.min(Math.abs(max - min), result);

                    }
                }            
            }
        }

        System.out.print(result);
    }
    
}