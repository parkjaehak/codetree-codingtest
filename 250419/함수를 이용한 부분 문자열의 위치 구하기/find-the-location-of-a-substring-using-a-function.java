import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();


        //시작 인덱스를 출력한다.
        int index = process(text, pattern);
        // Please write your code here.
        System.out.print(index);


    }
    static int process(String text, String pattern){
        int index = -1;
        for(int i = 0; i < text.length() - pattern.length() + 1; i++){
            boolean match = true;
            for(int j = 0; j < pattern.length(); j++){
                if(text.charAt(i + j) != pattern.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
                index = i;
                break;
            }
          
        }
        return index;
    }
}