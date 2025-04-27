import java.util.*;

public class Main {
    static int N, K;
    static String T;
    static char[] arrT;
    static List<String> selected = new ArrayList<>();

    
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        K = sc.nextInt();
        T= sc.next();
        arrT = T.toCharArray();

        for(int i = 0; i < N; i++){
            char [] arr1 = sc.next().toCharArray();

            if(check(arr1)){
               selected.add(new String(arr1));
            }
        }


        Collections.sort(selected);
        System.out.print(selected.get(K - 1));
    }   


    //T로 시작하는 문자열만 선택한다.
    static boolean check(char []arr){
        if (arr.length < arrT.length) {
            return false; // arr이 arrT보다 짧으면 탈락
        }
        for(int i = 0; i < arrT.length; i++){
            if(arrT[i] != arr[i]){
                return false;
            }
        }

        return true;

    }
}