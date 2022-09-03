import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10250_ACM_호텔 {
    static int H, W, N, roomH, roomW;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int testcase = 0; testcase < T; testcase++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            H = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int cnt = 0;

            outer:
            for (int i = 0; i < W; i++) {
                for (int j = H - 1; j >= 0; j--) {
                    if (++cnt == N) {
                        roomH = j;
                        roomW = i;
                        break outer;
                    }
                }
            }
            roomH = H - roomH;
            roomW += 1;

            sb.append(roomH);
            if (roomW < 10) {
                sb.append("0").append(roomW);
            } else {
                sb.append(roomW);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
