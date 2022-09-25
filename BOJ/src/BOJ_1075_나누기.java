import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1075_나누기 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            int F = Integer.parseInt(br.readLine());

            int one = N % 10;
            int ten = (N / 10) % 10;

            int temp = N - one - ten * 10;
            int ans = -1;
            for (int i = 0; i < 100; i++) {
                if(temp % F == 0){
                    ans = i;
                    break;
                }
                temp++;
            }

            if(ans < 10){
                System.out.println("0" + ans);
            } else{
                System.out.println(ans);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
