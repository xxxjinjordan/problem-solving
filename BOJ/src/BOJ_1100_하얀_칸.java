import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1100_하얀_칸 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            String input = br.readLine();
            for (int j = 0; j < 8; j++) {
                char c = input.charAt(j);
                // 흰칸
                if(i % 2 == 0 && j % 2 == 0 && c == 'F'){
                    cnt++;
                } else if(i % 2 != 0 && j % 2 != 0 && c == 'F'){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
