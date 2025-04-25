import java.util.*;

public class Main {
    static int []arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.


        //오름차순
        Arrays.sort(arr);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        //내림차순
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int i = 0; i < n; i++)
            System.out.print(arr2[i] + " ");

       
    }
}