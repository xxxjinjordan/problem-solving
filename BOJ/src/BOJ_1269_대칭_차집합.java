import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_1269_대칭_차집합 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		Set<Integer> setA = new HashSet<Integer>();
		Set<Integer> setB = new HashSet<Integer>();
		Set<Integer> setCommon = new HashSet<Integer>();

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			setA.add(Integer.parseInt(st.nextToken()));
		}

		st = new StringTokenizer(br.readLine()); 
		for (int i = 0; i < M; i++) {
			int element = Integer.parseInt(st.nextToken());
			setB.add(element);
			if(setA.contains(element)) {
				setCommon.add(element);
			}
		}
		
		for (Integer num : setCommon) {
			if(setA.contains(num)) {
				setA.remove(num);
			}
			if(setB.contains(num)) {
				setB.remove(num);
			}
		}
		
		System.out.println(setA.size() + setB.size());
	}

}
