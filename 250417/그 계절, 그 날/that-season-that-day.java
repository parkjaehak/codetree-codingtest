import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.

        if(isExistDate(y,m,d)){
            String weather = checkWeather(m);
            System.out.print(weather);
        }else{
            System.out.print(-1);
        }
    }

    static boolean isExistDate(int y, int m, int d){
        //윤년이면 2월이 29일까지 있다. 윤년이 아니면 28일까지 있다.
        if(m <= 12 && d <= findDays(y, m))
            return true;
        return false;
    }

    static int findDays(int y, int m) {
        if(m == 2){
            if(checkLunar(y)){
                return 29;
            }else{
                return 28;
            }
        }
        if(m == 4 || m == 6 || m == 9 || m == 11){
            return 30;
        }
        return 31;
    }


    static boolean checkLunar(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                }
                return false;
            }
            return true;
        }else{
            return false;
        }
    }

    static String checkWeather(int month){
        if(month >= 3 && month <= 5){
            return "Spring";
        }else if(month >= 6 && month <= 8){
            return "Summer";
        }else if(month >= 9 && month <= 11){
            return "Fall";
        }else{
            return "Winter";
        }
    }


}