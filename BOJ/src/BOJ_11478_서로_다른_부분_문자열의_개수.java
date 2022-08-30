import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_11478_서로_다른_부분_문자열의_개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		Set<String> set = new HashSet<String>();
		
		for (int i = 0; i < input.length(); i++) {
			String temp = "";
			for (int j = i; j < input.length(); j++) {
				temp += input.substring(j, j + 1);
				set.add(temp);
			}
		}
		
		System.out.println(set.size());

	}

}
