import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1654_랜선_자르기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            long max = Integer.MIN_VALUE;
            long cable[] = new long[K];

            for (int i = 0; i < K; i++) {
                cable[i] = Long.parseLong(br.readLine());
                if(cable[i] > max) max = cable[i];
            }
            long mid = -1;
            long left = 0;
            long right = max + 1;
            while(left < right){
                mid = (left + right) / 2;
                long cutCnt = 0;
                for (int i = 0; i < K; i++) {
                    cutCnt += cable[i] / mid;
                }
                // 필요한 랜선 개수보다 자른 랜선이 더 많다 -> 더 길게 잘라야한다.
                if(cutCnt >= N){
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            System.out.println(left - 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
