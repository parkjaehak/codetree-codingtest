import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++)
            a[i] = sc.nextInt();
        // Please write your code here.
        //초기 수열 복구하기
        //n = 5이면 1,2,3,4,5의 수열이 생성된다.
        int [] b = new int[n];
        //선택한다. 순서대로 모든 조합을 
        for(int i = 1; i <= n; i++){
            b[0] = i;
            boolean valid = true;

            for(int j = 1; j < n; j++){
                b[j] = a[j - 1] - b[j - 1];
            }
            boolean []seen = new boolean[n + 1];
            for(int k = 0; k < n; k++){
                if(b[k] < 1 || b[k] > n || seen[b[k]]){
                    valid = false;
                    break;
                }
                seen[b[k]] = true; //중복된 수가 나오면 안된다.
            }

            if(valid){
                for(int l = 0; l < n; l++){
                    System.out.print(b[l] + " ");
                }
                return;
            }
        }
    }
}