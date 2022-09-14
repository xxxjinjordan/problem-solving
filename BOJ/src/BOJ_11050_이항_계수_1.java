import java.util.Scanner;

public class BOJ_11050_이항_계수_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int factorial[] = new int[11];
        factorial[0] = 1;
        factorial[1] = 1;

        for (int i = 2; i < factorial.length; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        System.out.println(factorial[N] / factorial[K] / factorial[N - K]);
    }
}
