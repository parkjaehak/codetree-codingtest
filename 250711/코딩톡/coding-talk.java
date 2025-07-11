import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int p = sc.nextInt();

        char[] c = new char[M];
        int[] u = new int[M];

        for (int i = 0; i < M; i++) {
            c[i] = sc.next().charAt(0); //메세지 보낸 사람
            u[i] = sc.nextInt(); //최종적으로 읽지 않은 사람 수 
        }
   
        //각 사람별로 마지막으로 읽은 메시지 번호를 추적
        int[] lastRead = new int[N]; // 각 사람의 마지막으로 읽은 메시지 번호
        
        for (int i = 0; i < M; i++) {
            int senderIdx = c[i] - 'A';
            lastRead[senderIdx] = i + 1; // i번째 메시지까지 읽음
         // 추가로 읽지 않은 사람 수(u[i])를 활용해 상태를 추적해야 함
        }

        for (int i = 0; i < N; i++) {
            if (lastRead[i] < p) {
                char name = (char)('A' + i);
                System.out.print(name + " ");
            }
        }
    }
}