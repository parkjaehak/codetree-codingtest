import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] seat = sc.next().toCharArray();
  

        int max = 0;
        for(int i = 0; i < n; i++){
            if(seat[i] == '1'){
                continue;
            }
            seat[i] = '1';

            for(int j = i + 1; j < n; j++){
                if(seat[j] == '1'){
                    continue;
                }
                seat[j] = '1';

                int min = n;
                for(int k = 0; k < n; k++){
                    for(int l = k + 1; l < n; l++){
                        if(seat[k] == '1' && seat[l] == '1'){                
                            min = Math.min(min, l - k);
                        }
                    }
                }

                max = Math.max(min, max);
                seat[j] = '0';

            }    
            seat[i] = '0';     
        }

        System.out.print(max);
    }
}