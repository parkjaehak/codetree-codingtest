import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        boolean result = process(a, b);
        if(result){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
    //연속 부분 수열

    static boolean process(int[]a, int[] b){

        //b가 a의 원소들을 연속하게 뽑았을때 나올 수 있는 수열
        //연속이라는 키워드

        for(int i = 0; i < (a.length - b.length + 1); i++){
            boolean flag = true;
            for(int j = 0; j < b.length; j++){
                if(a[i + j] != b[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}