import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1233_주사위 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            int sums[] = new int[one + two + three + 1];

            int max = Integer.MIN_VALUE;

            for (int i = 1; i <= one; i++) {
                for (int j = 1; j <= two; j++) {
                    for (int k = 1; k <= three ; k++) {
                        sums[i + j + k]++;
                        if(sums[i + j + k] > max) max = sums[i + j + k];
                    }
                }
            }

            for (int i = 0; i < sums.length; i++) {
                if(sums[i] == max){
                    System.out.println(i);
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
