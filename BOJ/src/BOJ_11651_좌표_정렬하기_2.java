import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11651_좌표_정렬하기_2 {
    static class Point implements Comparable<Point> {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            if (this.y == p.y) {
                return this.x - p.x;
            } else {
                return this.y - p.y;
            }
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int N = Integer.parseInt(br.readLine());
            Point list[] = new Point[N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                list[i] = new Point(x, y);
            }
            Arrays.sort(list);
            for (int i = 0; i < N; i++) {
                bw.write(list[i].x + " " + list[i].y + "\n");
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
