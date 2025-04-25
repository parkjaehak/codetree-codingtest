import java.util.Scanner;

public class Main {
    static int []arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.


        //재귀함수를 이용한 최소공배수
        //최소(a,b) * 최대(a,b) = a * b

        //1. 두 수의 LCM을 구하는 메서드를 만들고,
        //2. 배열의 앞에서부터 두 수씩 재귀적으로 LCM을 구해서 전체의 LCM을 구하는 방식
        
        System.out.print(process(0));

    }

    static int process(int index){
        if(index == arr.length - 1){
            return arr[index];
        }

        return lcm(arr[index], process(index + 1));
    }


    //greatest common divisor (최대 공약수)
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }


    //least common multiple (최소 공배수)
    static int lcm(int a, int b) {
        return a / gcd(a, b) * b; // 오버플로 방지
    }
} 