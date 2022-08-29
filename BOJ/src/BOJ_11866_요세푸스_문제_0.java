import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866_요세푸스_문제_0 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		sb.append("<");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		List<Integer> list = new ArrayList<Integer>();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 0; i < N; i++) {
			q.offer(i + 1);
		}
		
		while(!q.isEmpty()) {
			for (int i = 0; i < K - 1; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll()).append(", ");
		}
		
		sb.delete(sb.length() - 2, sb.length());
		
		sb.append(">");
		
		System.out.println(sb.toString());
		
	}

}
