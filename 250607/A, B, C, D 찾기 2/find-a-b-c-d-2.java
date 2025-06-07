import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        int[] sum = new int[41];

        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
            sum[arr[i]] += 1;
        }

        for (int i = 1; i <= 40; i++) {
            for (int j = 1; j <= 40; j++) {
                for (int m = 1; m <= 40; m++) {
                    for (int n = 1; n <= 40; n++) {
                        if (i + j + m + n > 40) continue;

                        int[] sum2 = new int[41];

                        int[] nums = {i, j, m, n};

                        // 단일값
                        for (int a = 0; a < 4; a++) {
                            sum2[nums[a]]++;
                        }

                        // 2개 조합
                        for (int a = 0; a < 4; a++) {
                            for (int b = a + 1; b < 4; b++) {
                                sum2[nums[a] + nums[b]]++;
                            }
                        }

                        // 3개 조합
                        for (int a = 0; a < 4; a++) {
                            for (int b = a + 1; b < 4; b++) {
                                for (int c = b + 1; c < 4; c++) {
                                    sum2[nums[a] + nums[b] + nums[c]]++;
                                }
                            }
                        }

                        // 4개 합
                        int total = i + j + m + n;
                        sum2[total]++;

                        // 비교
                        boolean same = true;
                        for (int k = 1; k <= 40; k++) {
                            if (sum[k] != sum2[k]) {
                                same = false;
                                break;
                            }
                        }

                        if (same) {
                            System.out.println(i + " " + j + " " + m + " " + n);
                            return;
                        }
                    }
                }
            }
        }
    }
}
