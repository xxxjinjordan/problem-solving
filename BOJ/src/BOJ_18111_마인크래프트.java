import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_18111_마인크래프트 {
    static int[][] map;
    static int N, M, B;
    static int totalTime = Integer.MAX_VALUE;
    static int height = Integer.MIN_VALUE;


    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());

            map = new int[N][M];

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                    if (map[i][j] > max) max = map[i][j];
                    if (map[i][j] < min) min = map[i][j];
                }
            }

            bSearch(min, max);

            System.out.println(totalTime + " " + height);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void bSearch(int min, int max) {
        if (min > max) {
            return;
        }
        int mid = (min + max) / 2;

        int blocks = B;
        int time = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // 기준 높이보다 높을 경우
                if (map[i][j] > mid) {
                    blocks += map[i][j] - mid;
                    time += 2 * (map[i][j] - mid);
                } else if (map[i][j] < mid) { // 기준 높이보다 낮을 경우
                    blocks -= mid - map[i][j];
                    time += 1 * (mid - map[i][j]);
                }
            }
        }

        if(blocks >= 0){
            if(totalTime > time){
                totalTime = time;
                height = mid;
            } else if(totalTime == time){
                if(height < mid){
                    height = mid;
                }
            }
        }

        bSearch(min, mid - 1);

        bSearch(mid + 1, max);

    }
}
