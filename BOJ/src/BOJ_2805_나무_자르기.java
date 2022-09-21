import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2805_나무_자르기 {
    static int tree[];
    static long max;
    static int M;

    static long ans;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            tree = new int[N];

            for (int i = 0; i < N; i++) {
                tree[i] = Integer.parseInt(st.nextToken());
                if(max < tree[i]) max = tree[i];
            }

            bSearch(0, max);

            System.out.println(ans);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void bSearch(long start, long end) {
        if(start >= end) return;
        long mid = (start + end) / 2;
        long sum = 0;
        for (int i = 0; i < tree.length; i++) {
            if(tree[i] < mid) continue;
            sum += tree[i] - mid;
        }
        if(sum < M){
            bSearch(start, mid);
        } else{
            ans = mid;
            bSearch(mid + 1, end);
        }
    }
}
