import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] array = new int[200001];

        //흰색 1, 검정색 2
        int startIdx = 100000;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            if(d == 'R'){
                //오른쪽
                for(int j = 0; j < x; j++){
                    array[startIdx] = 2;
                    startIdx++;
                }
                startIdx--;

            }else{
                //d == L
                for(int j = 0; j < x; j++){
                    array[startIdx] = 1;
                    startIdx--;
                }
                startIdx++; //각 명령 이후에는 마지막으로 뒤집은 타일 위치에 서있는다.
            }
        }

        int blackcnt = 0, whitecnt = 0;
        for(int i : array){
            if(i == 1){
                //흰색
                whitecnt++;
            }else if(i == 2){
                //검정색
                blackcnt++;
            }
        }

        System.out.print(whitecnt + " " + blackcnt);
 

        
    }
}