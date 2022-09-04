import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2775_부녀회장이_될테야 {
    static int apt[][] = new int[15][15];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        // 0층 i호에는 i명이 거주합니다.
        for (int i = 0; i < apt[0].length; i++) {
            apt[14][i] = i + 1;
        }

        // 주어진 조건에 따라 아파트에 사람을 채웁니다.
        for (int i = apt.length - 2; i >= 0; i--) {
            for (int j = 0; j < apt[0].length; j++) {
                int sum = 0;
                for (int k = 0; k <= j; k++) {
                    sum += apt[i + 1][k];
                }
                apt[i][j] = sum;
            }

        }

        for (int testcase = 0; testcase < T; testcase++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            if (testcase < T - 1)
                sb.append(apt[14 - k][n - 1]).append("\n");
            else sb.append(apt[14 - k][n - 1]);
        }

        System.out.println(sb.toString());
    }
}
