import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        process1(n);
        System.out.println();
        process2(n);

    }

    //오름차순
    static void process1(int n){
        if(n == 0){
            return;
        }
         process1(n-1);
        System.out.print(n + " ");
       
    }

    //내림차순
    static void process2(int n){
      
        if(n == 0){
            return;
        }
          System.out.print(n + " ");
          process2(n-1);
    }
}