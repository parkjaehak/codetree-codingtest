import java.util.*;
public class Main {
    static List<Info> infos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            infos.add(new Info(height, weight, i + 1));
        }
        // Please write your code here.

        Collections.sort(infos);

        for(Info info : infos){
            System.out.println(info.height + " " + info.weight + " " + info.index);
        }
    }

    static class Info implements Comparable<Info>{
        int height, weight, index;

        Info(int height, int weight, int index){
            this.height = height;
            this.weight = weight;
            this.index = index;
        }

        @Override
        public int compareTo(Info info){
            if(this.height == info.height){
                if(this.weight == info.weight){
                    return this.index - info.index;
                }
                return info.weight - this.weight;
            }
            return info.height - this.height;
        }
    }
}