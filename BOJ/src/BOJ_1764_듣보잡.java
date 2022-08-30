import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;


public class BOJ_1764_듣보잡 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int cnt = 0;
		Set<String> set = new HashSet<String>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<String> list = new ArrayList<String>();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		for (int i = 0; i < M; i++) {
			String target = br.readLine();
			if(set.contains(target)) {
				cnt++;
				list.add(target);
			}
		}
		
		Collections.sort(list);
		
		for(String s : list) {
			sb.append(s).append("\n");
		}
		
		System.out.println(cnt);
		System.out.println(sb.toString());

	}

}
