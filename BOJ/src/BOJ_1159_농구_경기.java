import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1159_농구_경기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int alphabet[] = new int[26];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            alphabet[input.charAt(0) - 'a']++;
        }

        int cnt = 0;

        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] >= 5) {
                cnt++;
                char c = (char)('a' + i);
                sb.append(c);
            }
        }

        if(cnt == 0){
            System.out.println("PREDAJA");
        } else{
            System.out.println(sb.toString());
        }
    }

}
