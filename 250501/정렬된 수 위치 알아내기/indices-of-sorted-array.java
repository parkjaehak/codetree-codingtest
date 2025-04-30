import java.util.*;

public class Main {
    static List<Info> infos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
           int value = sc.nextInt();
            infos.add(new Info(value, i));

        }
        // Please write your code here.

        Collections.sort(infos);

        for(int i = 0; i < n; i++){
           infos.get(i).newIdx = i + 1; //이동한 위치 
        }

        Collections.sort(infos, new Comparator<Info>(){
            @Override
            public int compare(Info a, Info b){
                return a.orginIdx - b.orginIdx; //재정렬
            }}
        );

        for(Info info : infos){
            System.out.print(info.newIdx + " ");
        }

    }

    static class Info implements Comparable<Info>{
        int value;
        int orginIdx; //이전 인덱스
        int newIdx;  //정렬된 위치

        Info(int value, int orginIdx){
            this.value = value;
            this.orginIdx = orginIdx;
    
        }

        @Override
        public int compareTo(Info info){
            return this.value - info.value;
        }
    }

}