import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] array = new int[200001];
        int [] whiteCnt = new int[200001];
        int [] blackCnt = new int[200001];
        int startIdx = 100000;
     
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);


            //흰색 1, 검은색 2, 회색 3
            if(dir == 'L'){
                //현재칸을 포함한다.
                for(int j = 0; j < x; j++){        
                    if (array[startIdx] == 3) continue; // 회색이면 무시

                    whiteCnt[startIdx]++;
                    if (whiteCnt[startIdx] >= 2 && blackCnt[startIdx] >= 2) {
                        array[startIdx] = 3; // 회색으로 변경
                    } else {
                        
                        array[startIdx] = 1; // 흰색 덧씌우기
                    }
                    startIdx -= 1; // 왼쪽으로 이동
                }
                startIdx += 1;
            }else{
               for(int j = 0; j < x; j++){
                    if (array[startIdx] == 3) continue; // 회색이면 무시
                
                    blackCnt[startIdx]++;
                    if (whiteCnt[startIdx] >= 2 && blackCnt[startIdx] >= 2) {
                        array[startIdx] = 3; // 회색
                    } else {
                        array[startIdx] = 2; // 검은색 덧씌우기
                    }
                    startIdx += 1;
                }
                startIdx -= 1;
            }

        }

        int grey  = 0, black = 0, white = 0;
        for(int i : array){
            if(i == 1){
                white++;
            }else if(i == 2){
                black++;
            }else if(i == 3){
                grey++;
            }

        }

        System.out.print(white + " " + black + " " + grey);
    }
}
