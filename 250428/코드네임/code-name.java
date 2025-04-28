import java.util.*;
public class Main {
   static List<Info> infos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.

        for(int i = 0; i < 5; i++){
            char name = sc.next().charAt(0);
            int score = sc.nextInt();

            Info info = new Info(name, score);
            infos.add(info);
        }

        int min = 101;
        int minIndex = 0;
        for(int i = 0; i < 5; i++){
            Info info = infos.get(i);
            if(info.score < min){
                min = info.score;
                minIndex = i;
            }
        }

        Info info = infos.get(minIndex);
        System.out.print(info.name + " " + info.score);

    }


    static class Info{
        char name;
        int score;

        Info(char name, int score){
            this.name = name;
            this.score = score;
        }
    }
}