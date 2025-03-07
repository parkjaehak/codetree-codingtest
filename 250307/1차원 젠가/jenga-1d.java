import java.util.Scanner;
public class Main {

    static int n;
    static int[] blocks ;
    static int endOfArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        blocks = new int[n];

        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }

        endOfArray = n;

        int s1 = sc.nextInt() - 1;
        int e1 = sc.nextInt() - 1;
        cutArray(s1, e1);
        int s2 = sc.nextInt() - 1;
        int e2 = sc.nextInt() - 1;
        cutArray(s2, e2);

        
        System.out.println(endOfArray);
        for(int i = 0; i < endOfArray; i++){
            System.out.println(blocks[i]);
        }
    }

    public static void cutArray(int startIdx, int endIdx) {
        int[] temp = new int[n];
        int endOfTemp = 0;
        
        // 구간 외의 부분만 temp 배열에 순서대로 저장합니다.
        for(int i = 0; i < endOfArray; i++)
            if(i < startIdx || i > endIdx)
                temp[endOfTemp++] = blocks[i];
        
        // temp 배열을 다시 blocks 배열로 옮겨줍니다.
        for(int i = 0; i < endOfTemp; i++)
            blocks[i] = temp[i];
        
        endOfArray = endOfTemp;
    }
}