import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        int [] sum = new int[41];


        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
            sum[arr[i]] += 1;
        }

        
        //입력값은 1부터 40까지 가능하다
        //입력 값을 인덱스라고 할때 해당 인덱스의 횟수가 값이라고 한다.

        //4번의 숫자는 1부터 40까지 반복가능하다
        //a,b,c,d를 정한다.
        for(int i = 1; i <= 40; i++){
            for(int j = 1; j <= 40; j++){
                for(int m = 1; m <= 40; m++){
                    for(int n = 1; n <= 40; n++){
                        if((i + j + m + n) <= 40){
                            int[] sum2 = new int[41];
                      

                            sum2[i] += 1;
                            sum2[j] += 1;
                            sum2[m] += 1;
                            sum2[n] += 1;

                            sum2[i + j] += 1;
                            sum2[i + m] += 1;
                            sum2[i + n] += 1;
                            sum2[j + m] += 1;
                            sum2[j + n] += 1;
                            sum2[m + n] += 1;

                            sum2[i + j + m] += 1;
                            sum2[i + j + n] += 1;
                            sum2[j + m + n] += 1;
                            sum2[i + m + n] += 1;

                            sum2[i + j + m + n] += 1;


                            boolean isSame = true;
                            for(int k = 1; k <= 40; k++){
                                if(sum[k] != sum2[k]){
                                    isSame = false;
                                    break;
                                }
                            }

                            if (isSame) {
                                System.out.println(i + " " + j + " " + m + " " + n);
                                return; // 찾았으면 종료
                            }

                            
                        }
                    }
                }
            }
        }

    }
}