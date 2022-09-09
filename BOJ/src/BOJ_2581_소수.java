import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2581_소수 {
    static boolean notPrime[] = new boolean[10001];
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            // 1은 소수가 아닙니다.
            notPrime[1] = true;
            int M = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            for (int i = 2; i < notPrime.length; i++) {
                for (int j = 2; i * j < notPrime.length; j++) {
                    if(!notPrime[i * j]) notPrime[i * j] = true;
                }
            }
            int sum = 0;
            boolean flag = false;
            int min = Integer.MAX_VALUE;
            for (int i = M; i <= N; i++) {
                if(!notPrime[i]) {
                    sum += i;
                    if(!flag){
                        min = i;
                        flag = true;
                    }
                }
            }
            if(sum == 0) {
                System.out.println(-1);
                return;
            } else{
                System.out.println(sum);
                System.out.println(min);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
