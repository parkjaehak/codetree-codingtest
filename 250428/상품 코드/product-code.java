import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        Info info = new Info("codetree", 50);
        Info info2 = new Info(id2, code2);

        System.out.printf("product %d is %s \n", info.code2, info.id2);
        System.out.printf("product %d is %s \n", info2.code2, info2.id2);
    }

    static class Info{
        String id2;
        int code2;

        Info(String id2, int code2){
            this.id2 = id2;
            this.code2 = code2;
        }
    }
}