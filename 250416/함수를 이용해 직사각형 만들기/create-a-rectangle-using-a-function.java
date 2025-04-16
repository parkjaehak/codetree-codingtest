import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        // Please write your code here.

        func(rowNum, colNum);
    }
    static void func(int row, int col){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j ++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}