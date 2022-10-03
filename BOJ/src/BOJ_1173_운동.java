import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1173_운동 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 총 시간
        int N = Integer.parseInt(st.nextToken());
        // 초기 맥박
        int m = Integer.parseInt(st.nextToken());
        // 최대 맥박
        int M = Integer.parseInt(st.nextToken());
        // 운동 시 상승 맥박
        int T = Integer.parseInt(st.nextToken());
        // 휴식 시 하강 맥박
        int R = Integer.parseInt(st.nextToken());

        int exTime = 0;
        int restTime = 0;
        int totalTime = 0;

        int now = m;

        boolean flag = true;

        while(true){
            totalTime++;
            if(m + T > M){
                flag = false;
                break;
            }

            if(now + T <= M){
                now += T;
                exTime++;
            } else{
                now -= R;
                if(now < m) now = m;
                restTime++;
            }

            if(exTime == N){
                break;
            }
        }

        if(flag){
            System.out.println(totalTime);
        } else{
            System.out.println(-1);
        }
    }
}
