import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4948_베르트랑_공준 {
    static boolean isNotPrime[] = new boolean[246913];

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            isNotPrime[1] = true;
            for (int i = 2; i < isNotPrime.length; i++) {
                for (int j = 2; i * j < isNotPrime.length; j++) {
                    if (!isNotPrime[i * j]) isNotPrime[i * j] = true;
                }
            }
            while (true) {
                String input = br.readLine();
                if (input.equals("0")) break;
                int N = Integer.parseInt(input);
                int cnt = 0;
                for (int i = N + 1; i <= 2 * N; i++) {
                    if(!isNotPrime[i]) cnt++;
                }
                sb.append(cnt).append("\n");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
