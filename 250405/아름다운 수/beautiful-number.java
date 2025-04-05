import java.util.Scanner;
public class Main {
    static int N;
    static int [] selected;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        selected = new int[N];
    //해당 숫자만 큼 같은 수 연달아
    //N자리의 아름다운 수는 몇개?
    //2가 2번 나온 것이 반복되어도 아름다운수
    //3이 3번 나온 것이 반복되어도 아름다운 수

        //4자리
        //1111 1122 1333 2211 3331
        //5자리
        //11111 11122 11333 12222 13331


        process(0);
        System.out.print(count);

    }

    static void process(int depth){
        if(depth == N){
            //아름다운 수인지 검증한다.
            if (isBeautiful()) {
                count++;  // 아름다운 수면 개수 증가
            }
            return;
        }

        for(int i = 1; i <= 4; i++){
            selected[depth] = i; //1~4중에 하나 선택한다.
            process(depth + 1);
        }
    }


    static boolean isBeautiful(){
        int i = 0;
        while(i<N){
            int curr = selected[i];

            if(i + curr > N){
                //자리수보다 큰 수가 나오면 더 이상 볼필요가 없다.
                return false;
            }

            //현재 수만큼 연속된 수가 나와야함
            for(int j = 1; j < curr; j++){
                if(selected[i + j] != curr){
                    return false;
                }
            }

            i += curr;
        }
        return true; //끝까지 이상없으면 아름다운 수이다.
    }
}