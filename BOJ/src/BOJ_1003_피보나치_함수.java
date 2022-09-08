import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003_피보나치_함수 {
    static int memo[][] = new int[41][2];

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            int T = Integer.parseInt(br.readLine());
            memo[0][0] = 1;
            memo[0][1] = 0;
            memo[1][0] = 0;
            memo[1][1] = 1;
            for (int i = 2; i <= 40 ; i++) {
                memo[i][0] = memo[i-1][0] + memo[i-2][0];
                memo[i][1] = memo[i-1][1] + memo[i-2][1];
            }
            for (int testcase = 1; testcase <= T; testcase++) {
                int N = Integer.parseInt(br.readLine());
                sb.append(memo[N][0]).append(" ").append(memo[N][1]).append("\n");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
