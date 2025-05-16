import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int[] count1 = new int[n];
        int[] count2 = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        // Please write your code here.
        //b가 유추할 수 있는 수는 몇개인가
        //1번카운트  동일한 위치에 있다
        //2번카운트 다른 자리에 있다.

        int result = 0;
        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                for(int k = 1; k <=9; k++){

                    if(i == j || j == k || i == k){
                        continue; //서로다른 세자리
                    }

                    boolean flag = true;
                    for(int l = 0; l < n; l++){
                        //n개 만큼 반복해서 알아낸다.

                        int curr = num[l]; //321
                        int a = curr / 100; //백의 자리 3
                        int b = (curr % 100) / 10; //십의 자리 2
                        int c = (curr % 100) % 10; 

                        int cnt1 = 0, cnt2 = 0;

                        if(i == a){
                            cnt1++;
                        }
                        if(j == b){
                            cnt1++;
                        }
                        if(k == c){
                            cnt1++;
                        }
                        if(i == b || i == c){
                            cnt2++;
                        }
                        if(j == a || j == c){
                            cnt2++;
                        }
                        if(k == a || k == b){
                            cnt2++;
                        }


                        if(cnt1 != count1[l] || cnt2 != count2[l]){
                            flag = false;
                            break;
                            //하나라도 다르면 벗어난다.
                        }

                    }   

                    if(flag){
                        result++;
                    }



                }


            }
        }
        System.out.print(result);
    }
}