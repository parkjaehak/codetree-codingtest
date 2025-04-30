import java.util.*;
public class Main {
     static List<Info> infos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
          infos.add(new Info(name, height, weight));
        }
        Collections.sort(infos);

        for(Info info : infos){
            System.out.println(info.name + " " + info.height + " " + info.weight);
        }
    }


    static class Info implements Comparable<Info>{
        int height, weight;
        String name;

        Info(String name, int height, int weight){
            this.height = height;
            this.weight = weight;
            this.name = name;
        }

        @Override
        public int compareTo(Info info){
            if(this.height == info.height){
                return info.weight - this.weight;
            }
            return this.height - info.height;
        }
    }
}