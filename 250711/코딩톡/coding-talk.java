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
   
     
        boolean[] people = new boolean[N + 1];
        //특정 사람의 이름과 가능성을 함께 묶어서 관리

        for(int i = p; i < M; i++){
            //메세지를 보낸 사람을 찾고 해당 사람은 pass
            char name = c[i];
            people[name - 'A' + 1] = true; //pass
        }
        //내가 메세지를 보냈기 때문에 나도 pass
        char myName = c[p - 1];
        people[myName - 'A' + 1] = true;


        for (int j = 1; j <= N; j++) {
            if (!people[j]) {
                char name = (char) ('A' + j - 1);
                System.out.print(name + " ");
            }
        }
    }
}