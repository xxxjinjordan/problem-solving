import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1032_명령_프롬프트 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String ans = br.readLine();

        char array[] = ans.toCharArray();

        for (int i = 0; i < N - 1; i++) {
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                if(input.charAt(j) != array[j]){
                    array[j] = '?';
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        System.out.println(sb.toString());
    }
}
