import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        // Please write your code here.
        //가로 혹은 세로 직선 3개로 모든 좌표를 지날 수 있아면 1, 아니면 0을 출력해

        int result = 0;
        for(int i = 0; i <= 10; i++){
            for(int j = 0; j <= 10; j++){
                for(int k = 0; k <= 10; k++){

                    boolean success = true;
                    for(int l = 0; l < n; l++){
                        if(x[l] == i || x[l] == j || x[l] == k){
                            continue;
                        }
                        success = false;
                    }
                    if(success){
                        result = 1;
                    }


                    success = true;
                    for(int l = 0; l < n; l++){
                        if(x[l] == i || x[l] == j || y[l] == k){
                            continue;
                        }
                        success = false;
                    }
                    if(success){
                        result = 1;
                    }

                    success = true;
                    for(int l = 0; l < n; l++){
                        if(x[l] == i || y[l] == j || y[l] == k){
                            continue;
                        }
                        success = false;
                    }
                    if(success){
                        result = 1;
                    }

                    success = true;
                    for(int l = 0; l < n; l++){
                        if(y[l] == i || y[l] == j || y[l] == k){
                            continue;
                        }
                        success = false;
                    }
                    if(success){
                        result = 1;
                    }




                }
            }
        }

        System.out.print(result);
    }
}