import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_11653_소인수분해 {
    static boolean primeNumber[] = new boolean[10000001];
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            int N = Integer.parseInt(br.readLine());
//            Arrays.fill(primeNumber, true);
//            for (int i = 2; i < primeNumber.length; i++) {
//                for (int j = 2; i * j < primeNumber.length ; j++) {
//                    primeNumber[i*j] = false;
//                }
//            }
            int start = 2;
            if(N == 1) return;
            while(true){
                if(N % start == 0) {
                    sb.append(start).append("\n");
                    N /= start;
                    if(N == 1) break;
                } else start++;
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
