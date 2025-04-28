import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.

        Info info1 = new Info("codetree", 10);
        Info info2 = new Info(id, level);

        System.out.println("user " + info1.id + " lv " + info1.level);
        System.out.println("user " + info2.id + " lv " + info2.level);
    }


    static class Info{
        String id;
        int level;

        Info(String id, int level){
            this.id = id;
            this.level = level;
        }
    }
}