import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2609_최대공약수와_최소공배수 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int A = a >= b ? a : b;
            int B = a <= b ? a : b;
            int GCD = -1;
            for (int i = B; i > 0; i--) {
                if(A % i == 0 && B % i == 0){
                    GCD = i;
                    break;
                }
            }
            System.out.println(GCD);
            System.out.println(A / GCD * B / GCD * GCD);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
