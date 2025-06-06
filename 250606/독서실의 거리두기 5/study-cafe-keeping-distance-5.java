import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] seat = sc.next().toCharArray();
        // Please write your code here.

        //최대한 거리를 두자
        //한 명을 더 집어넣었을때 가장 가까운 두 사람 간 거리가 최대가 되도록 하자
        //새로 앉힌 사람 기준으로 가장 가까운 두 사람 간 거리를 구하는게 아니고 그냥 사람을 앉히고 모든 사람 중 가장 가까운 두 사람간 거리를 최대로 하는 곳을 찾아야한다

        //0인칸 모든 칸을 선택해보고
        int max = 0;
        for(int i = 0; i < n; i++){
      
            if(seat[i] == '1'){
                continue;
            }

            //가장 가까운 사람간의 거리를 구한다.
            seat[i] = '1';
            int min = n;
            for(int j = 0; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    //모든 쌍을 조사한다.
                    if(seat[k] == '1' && seat[j] == '1'){
                        //가장 가까운 사람을 구한다.
                        min = Math.min(min, k - j);
                    }
                }
            }

            max = Math.max(min, max);
            seat[i] = '0';

        }

        System.out.print(max);
    }
}