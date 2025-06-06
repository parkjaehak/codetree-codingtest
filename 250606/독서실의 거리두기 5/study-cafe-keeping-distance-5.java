import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String seat = sc.next();
        // Please write your code here.

        //최대한 거리를 두자
        //한 명을 더 집어넣었을때 가장 가까운 두 사람 간 거리가 최대가 되도록 하자

        //0인칸 모든 칸을 선택해보고
        int max = 0;
        for(int i = 0; i < n; i++){
            int left = Integer.MAX_VALUE;
            int right = Integer.MAX_VALUE;

            if(seat.charAt(i) == '1'){
                continue;
            }

            //해당칸에서 거리를 측정하고
            //왼쪽거리
            for(int l = i - 1; l >= 0; l--){
                if(seat.charAt(l) == '1'){
                    left = i - l; //현재위치에서 최초1인위치를 뺀다
                    break;
                }

            }
            //오른쪽거리
            for(int r = i + 1; r < n; r++){
                if(seat.charAt(r) == '1'){
                    right = r - i;
                    break;
                }
            }

            int min = Math.min(left, right);
            max = Math.max(min, max);

        }

        System.out.print(max);
    }
}