import java.util.*;

public class Main {
       static List<Info> infos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            infos.add(new Info(x, y, i+1));
        }
        Collections.sort(infos);
        for(Info info : infos){
            System.out.println(info.idx);
        }
        
    }


    static class Info implements Comparable<Info>{
        int x,y, idx;
        
        Info(int x, int y, int idx){
            this.x = x;
            this.y = y;
            this.idx = idx;
        }

        @Override
        public int compareTo(Info info){
            //기준점 (0,0)일때의 거리
            int thisDist = Math.abs(this.x) + Math.abs(this.y);
            int otherDist = Math.abs(info.x) + Math.abs(info.y);
            return thisDist - otherDist; // 오름차순
        }
    }
}