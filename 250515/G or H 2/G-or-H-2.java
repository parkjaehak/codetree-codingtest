import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char [] arr = new char[101];
        for (int i = 0; i < n; i++) {
            int position = sc.nextInt();
            char ch = sc.next().charAt(0);

            arr[position] = ch;
        }
        // Please write your code here.

        int max = 0;

        //i부터 j까지 구간을 잡는다.
        for(int i = 0; i <= 100; i++){
            for(int j = i + 1; j <= 100; j++){
                if(arr[i] == 0 || arr[j] == 0){
                    continue;
                }

                int cntG = 0;
                int cntH = 0;

                for(int k = i; k <= j; k++){
                    if(arr[k] == 'G'){
                        cntG++;
                    }else if(arr[k] == 'H'){
                        cntH++;
                    }
                }
            
       
                if(cntG == 0 || cntH == 0 || cntH == cntG){
                    int len = j - i;
                    max = Math.max(max, len);

                }
            }
        }
        
        System.out.print(max);
        

    }
}