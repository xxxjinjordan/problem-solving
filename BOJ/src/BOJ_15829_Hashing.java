import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15829_Hashing {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int L = Integer.parseInt(br.readLine());
            long sum = 0;
            long mul = 1;
            String input = br.readLine();
            for (int i = 0; i < L; i++) {
                sum += (input.charAt(i) - 'a' + 1) * mul;
                mul *= 31;
                mul %= 1234567891;
            }
            System.out.println(sum % 1234567891);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
