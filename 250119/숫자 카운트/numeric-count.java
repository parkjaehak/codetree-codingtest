import java.io.*;
import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<int[]> infos = new ArrayList<>();
    static int N;

    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            infos.add(new int[]{num, first, second});
        }


        //두 숫자를 자리별로 비교하여, 같은 자리에 있으면 1번 카운트를 증가
        //숫자가 존재하지만 다른 자리에 있으면 2번 카운트를 증가
        //123~987까지 완탐

        int result = 0;
        for(int i = 123; i <=987; i++){
            //서로 다른 세 자리 수인지 검증
            if(!isValidNumber(i)){
                continue;  
            }
            
            boolean isPossible = true;
            for(int j = 0; j < infos.size(); j++){
                int []curr = infos.get(j);
                if(!isMatch(i, curr)){
                    isPossible = false; //infos 중 하나라도 맞지 않으면 pass
                    break;
                }
            }

            if(isPossible){
                result++; //모든 info에 맞는 num일 경우
            }
        }
        System.out.println(result);
    }

    static boolean isMatch(int num, int[] info){
        String numStr = String.valueOf(num);
        String infoStr = String.valueOf(info[0]);

        int first = 0; int second = 0;

        for(int i = 0; i < 3; i++){
            for(int j =0; j < 3; j++){
                if(numStr.charAt(i) == infoStr.charAt(j)){
                    if(i == j){
                        first++; //같은자리
                    }else{
                        second++; //다른자리
                    }
                }
            }
        }

        if(first == info[1] && second == info[2]){
            return true;
        }else{
            return false;
        }
    }

    static boolean isValidNumber(int num){
        String str = String.valueOf(num);
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);

        if(a != b && b != c && a != c && a != '0' && b != '0' && c != '0'){
            return true;
        }else{
            return false;
        }
    }
}