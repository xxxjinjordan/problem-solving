import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929_소수_구하기 {
    static boolean notPrime[] = new boolean[1000001];
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try{
            notPrime[1] = true;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            for (int i = 2; i < notPrime.length; i++) {
                for (int j = 2; i * j < notPrime.length; j++) {
                    if(!notPrime[i * j]) notPrime[i * j] = true;
                }
            }

            for (int i = M; i <= N; i++) {
                if(!notPrime[i]){
                    sb.append(i).append("\n");
                }
            }
            System.out.println(sb.toString());
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
