import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Set<Integer> set = new HashSet<>(); //중복제거
        for(int num : arr){
            set.add(num);
        }
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);

        //두번째로 작은 수가 없다면 -1 출력
        if(sorted.size() < 2){
            System.out.println(-1);
            return;
        }
        
        int secondMin = sorted.get(1);
        int count = 0;
        int index = -1;

        for(int i = 0; i < N; i++){
            if(arr[i] == secondMin){
                count++;
                if(index == -1){
                    index = i + 1; //위치 인덱스를 구해준다.
                }
            }
        }

        //두번째로 작은 값이 여러개라면 -1 출력
        if(count != 1){
            System.out.println(-1);
        }else{
            System.out.println(index);
        }

    }
}