import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        int count = process(A, B);
        System.out.print(count);
    }

    static int process(int a, int b){
        int count = 0;
        for(int i = a; i <= b; i++){
            //3,6,9 중에 하나가 들어가 있거나 3의 배수인 것의 개수
            if(has369(i) || i % 3 == 0){
                count ++;
            }
        }

        return count;
    }

    static boolean has369(int num){

        while(true){
            if(num == 0){
                break;
            }
            int digit = num % 10;
            if(digit == 3 || digit == 6 || digit == 9){
                return true;
            }
            num /= 10; //한 자리씩 줄인다.
        }
        return false;
    }
}