import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int maxHeight = 0;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            maxHeight = Math.max(maxHeight, h[i]);
        }
        // Please write your code here.
        //빙산덩어리 최대 개수
        int max = 0;
        for(int i = 1; i < maxHeight; i++){
            boolean inGroup = false;
            int group = 0;

            for(int j = 0; j < n; j++){
                if(h[j] > i){
                    if(!inGroup){
                        group++;
                        inGroup = true;
                    }
                }else{
                    inGroup = false; //그룹 해제 
                }
            }

            max = Math.max(max, group);
        }
        System.out.print(max);

    }
}