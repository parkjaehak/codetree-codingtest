import java.util.*;
public class Main {
    static List<Info> infos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            infos.add(new Info(name, height, weight));
        }
         Collections.sort(infos); // Info가 Comparable 구현했으니 이렇게 정렬 가능

        for (Info info : infos) {
            System.out.println(info.name + " " + info.height + " " + info.weight);
        }

    }

    static class Info implements Comparable<Info>{
        String name;
        int height;
        int weight;


        Info(String name, int height, int weight){
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Info info){
            return this.height - info.height; //오름차순
        }
    }

}