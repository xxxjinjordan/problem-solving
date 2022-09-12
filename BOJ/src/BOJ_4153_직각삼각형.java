import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4153_직각삼각형 {
    static Long a, b, c;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                a = Long.parseLong(st.nextToken());
                b = Long.parseLong(st.nextToken());
                c = Long.parseLong(st.nextToken());
                if(a == 0) break;
                long max = (a > b ? a : b) > c ? (a > b ? a : b) : c;

                if ((max == a && b * b + c * c == a * a) || (max == b && a * a + c * c == b * b) || (max == c && a * a + b * b == c * c)) {
                    sb.append("right").append("\n");
                } else {
                    sb.append("wrong").append("\n");
                }
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
