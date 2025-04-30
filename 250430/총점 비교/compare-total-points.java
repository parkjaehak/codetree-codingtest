import java.util.*;
public class Main {
    static List<Info> infos = new ArrayList<>();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            infos.add(new Info(name, score1, score2, score3));
        }
        Collections.sort(infos);
        // Please write your code here.
        for(Info info : infos){
            System.out.println(info.name + " " + info.score1 + " " + info.score2 + " " + info.score3);
        }
    }

    static class Info implements Comparable<Info>{
        int score1, score2, score3;
        String name;

        Info(String name, int score1, int score2, int score3){
            this.name = name;
            this.score1 = score1;
            this.score2 = score2;
            this.score3 = score3;
        }

        @Override
        public int compareTo(Info info){
            return ((this.score1 + this.score2 +  this.score3) - (info.score1 + info.score2 + info.score3));
        }
    }
}