import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726_2xn_타일링 {
    static int array[] = new int[1001];

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int N = Integer.parseInt(br.readLine());
            array[1] = 1;
            array[2] = 2;
            for (int i = 3; i < array.length; i++) {
                array[i] = (array[i - 2] % 10007 + array[i - 1] % 10007) % 10007;
            }
            System.out.println(array[N]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
