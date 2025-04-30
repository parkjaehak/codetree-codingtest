import java.util.*;
public class Main {

    static List<Info> infos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
  
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int korean = sc.nextInt();
            int english= sc.nextInt();
            int math = sc.nextInt();
            infos.add(new Info(name, korean, english, math));

        }
        Collections.sort(infos);


        for (Info info : infos) {
            System.out.println(info.name + " " + info.korean + " " + info.english + " " + info.math);
        }

    }

    static class Info implements Comparable<Info>{
        int korean, english, math;
        String name;

        Info(String name, int korean, int english, int math){
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public int compareTo(Info info){
            if(this.korean == info.korean){
                if(this.english == info.english){
                    return info.math - this.math;
                }
                return info.english - this.english;
            }
            return info.korean - this.korean; 
        }

        //compareTo 메서드는 양수가 나오면 this가 더 크다고 생각하고 뒤로 보낸다
        //오름차순일때 맞지만 내림차순은 반대로 식을 세워야한다.
        //결과가 양수면 this를 뒤로보낸다만 생각하자!!!
    }
}