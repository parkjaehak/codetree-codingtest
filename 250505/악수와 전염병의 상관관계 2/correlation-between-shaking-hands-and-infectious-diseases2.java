import java.util.*;
public class Main {
    static List<Info> infos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt();
        int T = sc.nextInt();
      
        for (int i = 0; i < T; i++) {
            int time = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            infos.add(new Info(time, x, y));
        }
        // Please write your code here.
        int [] a = new int[N + 1]; //감염여부
        int [] k = new int[N + 1]; //전염병 옮긴 횟수 k번까지 가능
        Collections.sort(infos);

        a[P] = 1; //감염됨


        for (int i = 0; i < T; i++) {
            Info curr = infos.get(i);
            int time = curr.time;
            int x = curr.x;
            int y = curr.y;


            //x또는 y가 전염병에 걸렸는지 확인 
            if(a[x] == 1 && a[y] == 0){
                if(k[x] < K){
                    a[y] = 1;
                    k[x]++;
                }
            }else if(a[y] == 1 && a[x] == 0){
                 if(k[y] < K){
                    a[x] = 1;
                    k[y]++;
                }
            }else if(a[x] == 1 && a[y] == 1){
                if(k[x] < K){
                    k[x]++;
                }
                if(k[y] < K){
                    k[y]++;
                }
            }
        }

        for(int i = 1; i <= N; i++){
           System.out.print(a[i]);
        }

    }


    static class Info implements Comparable<Info>{
        int time = 0, x = 0, y = 0;


        Info(int time, int x, int y){
            this.time = time;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Info info){
            return this.time - info.time;
        }
    }
}