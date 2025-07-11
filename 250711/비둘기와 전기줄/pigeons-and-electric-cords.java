import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //각 비둘기마다의 위치를 기록한다.
        int count = 0;
        Map<Integer, Integer> pos = new HashMap<>();


        for (int i = 0; i < N; i++) {
            int pigeon = sc.nextInt();
            int moveDir = sc.nextInt();

            if(pos.containsKey(pigeon)){
                if(pos.get(pigeon) != moveDir){
                    count++;
                }
            }

            pos.put(pigeon, moveDir);
        }
        // Please write your code here.

    

        System.out.print(count);
    }
}