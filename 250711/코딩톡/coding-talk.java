import java.util.Scanner;

public class Main {
    public static final int MAX_M = 100;
    
    public static int n, p, m;
    public static char[] c = new char[MAX_M];
    public static int[] u = new int[MAX_M];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        m = sc.nextInt();
        p = sc.nextInt();
        for(int i = 0; i < m; i++) {
            c[i] = sc.next().charAt(0);
            u[i] = sc.nextInt();
        }

        // 모두 읽은 채팅이라면 읽지 않은 사람은 없습니다.
        if(u[p - 1] == 0)
            System.exit(0);
        
        // 각 사람에 대해 채팅을 읽었을지 안 읽었을지 판단합니다.
        for(int i = 0; i < n; i++) {
            // read : 확실하게 채팅을 읽었으면 true
            char person = (char)((int)'A' + i);
            boolean read = false;

            // 만약 p번 메시지를 읽은 사람 수와 같은 채팅을 기준으로
            // 한번이라도 채팅을 쳤다면 확실하게 채팅을 읽었습니다.
            for(int j = 0; j < m; j++)
                if(u[j] >= u[p - 1] && c[j] == person)
                    read = true;
                
            if(read == false)
                System.out.print(person + " ");
        }
    }
}
