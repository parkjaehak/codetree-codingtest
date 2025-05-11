import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.

        int count = 0;
        for(int i = 0; i < input.length() - 2; i++){
            char curr = input.charAt(i);
            char next = input.charAt(i+1);
            if(curr == '(' && next == '('){
                for(int j = i + 1; j < input.length() - 1; j++){
                    char currEnd = input.charAt(j);
                    char nextEnd = input.charAt(j + 1);

                    if(currEnd == ')' && nextEnd == ')'){
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}