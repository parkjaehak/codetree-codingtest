import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int count = 0;
        for(int i = start; i <= end; i++){
            //약수가 세개인 수를 구하자
            //제곱수이면서, 그 제곱의 루트가 소수인 수
            //2, 3, 5
       
            int sqrt = (int) Math.sqrt(i);

            if(sqrt * sqrt == i){
                boolean isPrime = true;
                if(i < 2){
                    continue;      
                }
                for(int j = 2; j <= Math.sqrt(sqrt); j++){
                //2부터 해당 수까지 소수인지 판별
                    if(sqrt % j == 0){
                        //나누어 떨어지면 안됨
                        isPrime = false;
                        break;
                    }
                }

                if(isPrime){
                    count++;
                }
            }
        
        }

        System.out.print(count);
    }
}