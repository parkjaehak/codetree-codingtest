import java.util.*;

public class Main {
    static List<Info> infos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;


        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            infos.add(new Info(name, height, weight));
        }

        Collections.sort(infos, new Comparator<Info>() {
            @Override
            public int compare(Info info1, Info info2) {
                return info1.name.compareTo(info2.name); // 이름을 사전순으로 비교
            }
        });

        System.out.println("name");
        for (Info info : infos) {
            System.out.println(info.name + " " + info.height + " " + info.weight);
        }


        Collections.sort(infos, new Comparator<Info>() {
            @Override
            public int compare(Info info1, Info info2) {
                return info2.height - info1.height; // 내림차순 (큰 키가 먼저)
            }
        });

        System.out.println("\nheight");
        for (Info info : infos) {
            System.out.println(info.name + " " + info.height + " " + info.weight);
        }
    }
       



  static class Info{
        int height;
        double weight;
        String name;

        Info(String name, int height, double weight){
            this.height = height;
            this.weight = weight;
            this.name = name;
        }
    }
    
}