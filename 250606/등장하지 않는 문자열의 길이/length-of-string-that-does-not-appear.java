import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // Please write your code here.

        //연속 부분 문자열의 2번이상 나타나지 않는 문자열 중 최소 길이를 가진 문자열 찾기
        //길이가 k인 연속부분문자열 모두에 대해 두번 등장하지 않아야 한다.
        int min = Integer.MAX_VALUE;
        for(int k = 1; k <= n; k++){
            //길이가 i인 문자열 모두를 조회했을때 두번이상 나타나면 안된다.
            boolean hasDuplicate = false;

            for(int i = 0; i <= n - k; i++){
                String a = str.substring(i, i+k);
                //선택을 하고

                for(int j = i + 1; j <= n - k; j++){
                    String b = str.substring(j, j+k);
                    //하나하나 비교해서 같은게 있다면 
                    if(a.equals(b)){
                        hasDuplicate = true;
                        break;
                    }
                    
                }

                if(hasDuplicate){
                    break;
                }
            }

            if(!hasDuplicate){
                //false이면
                min = Math.min(min, k);
            }
        
        }

        System.out.print(min);
        

    }
}