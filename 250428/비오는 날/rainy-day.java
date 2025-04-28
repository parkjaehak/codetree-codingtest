import java.util.*;
public class Main {
    static List<Info> infos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            infos.add(new Info(date, day, weather));
        }


        Info min = new Info("2100-12-31", "Sun", "Rain");
        for (int i = 0; i < n; i++) {
            Info curr = infos.get(i);
            if(curr.weather.equals("Rain")){
                 if(curr.date.compareTo(min.date) < 0){
                    min = curr;
                }
            }
        }
        System.out.println(min.date + " " + min.day + " " +  min.weather);

    }


    static class Info{
        String date, day, weather;
        
        Info(String date, String day, String weather){
            this.date = date;
            this.day = day;
            this.weather = weather;
        }
    }
}