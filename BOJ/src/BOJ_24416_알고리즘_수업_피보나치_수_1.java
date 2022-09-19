import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_24416_알고리즘_수업_피보나치_수_1 {
    static int cnt1, cnt2;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());
            fibo1(N);
//            fibo2(N);
            cnt2 = N - 2;
            System.out.println(cnt1 + " " + cnt2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static int fibo2(int n) {
        int before = 1;
        int before2 = 1;
        int now = 2;
        for (int i = 3; i <= n; i++) {
            cnt2++;
            now = before + before2;
            before = before2;
            before2 = now;
        }
        return now;
    }

    private static int fibo1(int n) {
        if (n == 1 || n == 2) {
            cnt1++;
            return 1;
        } else {
            return fibo1(n - 1) + fibo1(n - 2);
        }
    }
}
