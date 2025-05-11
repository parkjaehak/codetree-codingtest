import java.util.Scanner;
public class Main {
    static int []arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.


        int max = -1;
        //10의 자리를 넘기지 않도록 해야한다
       
        for(int i = 0; i < n - 2; i++){
            for(int j = i + 1; j < n -1; j++){
                for(int k = j + 1; k < n; k++){
                    if(isCarry(i, j, k)){
                        continue;
                    }
                    int sum = arr[i] + arr[j] + arr[k];
                    max = Math.max(sum, max);
                }
            }
        }

        System.out.print(max);
    }

    static boolean isCarry(int i, int j, int k){
        int a = arr[i];
        int b = arr[j];
        int c = arr[k];


        //각 자리수를 모두 각각 더했을때 10이상이 되는 경우가 전혀 없다.

        while(true){
            if(a  == 0 && b == 0 && c == 0){
                return false;
            }
            int sum = (a % 10) + (b % 10) + (c % 10);
            if(sum >= 10){
                return true;
            }
            a /= 10;
            b /= 10;
            c /= 10;
        }

    }

}