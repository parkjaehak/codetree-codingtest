import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // Please write your code here.

        //한자리만 다른 숫자
        int count = 0;
        for(int i = x; i <= y; i++){
            String s = String.valueOf(i);

            int []digits = new int[10];
            for(char ch : s.toCharArray()){
                digits[ch - '0']++; //자리수를 count
            }
            
            int digitCounts = 0;
            for(int d : digits){
                if(d > 0){
                    digitCounts++;
                }
            }

            if(digitCounts == 2){
                //숫자가 두개로 몰려있는 경우 
                boolean isValid  = false;
                for(int d : digits){
                    if(d == 1){
                        //두 수중 하나는 무조건 1개만 있어야 함
                        isValid =true;
                    }
                }

                if(isValid){
                    count++;
                }
            }

        }

        System.out.print(count);
    }
}