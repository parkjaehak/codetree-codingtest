import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();

        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(str.charAt(i) == '(' && str.charAt(j) == ')'){
                    cnt++;
                }
            }
        }
         System.out.println(cnt);
    }
}