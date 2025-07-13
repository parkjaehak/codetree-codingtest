import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, Integer> scores = new HashMap<>();
        scores.put('A', 0);
        scores.put('B', 0);

        Set<Character> prevHall = new HashSet<>(Arrays.asList('A', 'B'));
        int changeCount = 0;

        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            scores.put(c, scores.get(c) + s); //더한 값으로 변경 

            int maxScore = Math.max(scores.get('A'), scores.get('B'));

            Set<Character> currHall = new HashSet<>();

            //둘중 더 큰 것, 혹은 둘 다 max일때 set에 저장한다.
            if (scores.get('A') == maxScore) currHall.add('A');
            if (scores.get('B') == maxScore) currHall.add('B');

            //이전 set와 달라졌을때, 즉 명예의 전당에 올라간 경우에 대해 changeCount를 증가시킨다.
            if (!currHall.equals(prevHall)) {
                changeCount++;
                prevHall = currHall;
            }
        }
        System.out.println(changeCount);

    }
}