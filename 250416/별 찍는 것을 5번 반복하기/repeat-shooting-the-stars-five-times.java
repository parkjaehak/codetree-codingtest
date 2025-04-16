import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        for(int i = 0; i < 5; i++){
            makeStars();
        }

    }

    static void makeStars(){
        for(int i = 0; i < 10; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}