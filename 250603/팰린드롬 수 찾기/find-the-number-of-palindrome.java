import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        //펠린드롬의 개수 세기

        int count = 0;
        for(int i = x; i <= y; i++){
          
            int num = i;

            int reverse = 0;
            int original = num;

            //루프를 돌려 뒤집었을때 같다면 같은 수이다.
            while(true){
                if(num <= 0){
                    break;
                }
                int r = num % 10;
                reverse = reverse * 10 + r;
                num /= 10;

                if(original == reverse){
                    count++;
                }
                
            }


        }

        System.out.print(count);
        
    }
}