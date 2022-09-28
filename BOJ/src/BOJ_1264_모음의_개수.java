import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1264_모음의_개수 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            while(true) {
                String input = br.readLine();
                if(input.equals("#")) break;
                int cnt = 0;
                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') cnt++;
                    else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') cnt++;
                }
                sb.append(cnt).append("\n");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
