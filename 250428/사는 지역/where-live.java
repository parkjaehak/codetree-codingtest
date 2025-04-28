import java.util.*;
public class Main {

    static List<Info> infos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address= sc.next();
            String region = sc.next();

            infos.add(new Info(name, address, region));
        }
        // Please write your code here.


        Info maxInfo = infos.get(0);
        for(int i = 1; i < n; i++){
            Info curr = infos.get(i);
            if(curr.name.compareTo(maxInfo.name) > 0){
                maxInfo = curr;
            }
        }

        System.out.println("name "+  maxInfo.name);
        System.out.println("addr "+  maxInfo.address);
        System.out.println("city "+  maxInfo.region);
    }

    static class Info{
        String name, address, region;

        Info(String name, String address, String region){
            this.name = name;
            this.address = address;
            this.region = region;
        }
    }
}