import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_14425_문자열_집합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<String> set = new HashSet<String>();
		
		int cnt = 0;
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		for (int i = 0; i < M; i++) {
			if(set.contains(br.readLine())) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
