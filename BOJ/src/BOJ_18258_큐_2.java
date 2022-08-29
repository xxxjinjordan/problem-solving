import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_18258_큐_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		Queue<Integer> q = new LinkedList<Integer>();
		int back = -1;
		int N = Integer.parseInt(br.readLine());

		// 입력
		for (int i = 0; i < N; i++) {
			String exec = br.readLine();
			if (exec.length() >= 6) {
				st = new StringTokenizer(exec);
				st.nextToken();
				back = Integer.parseInt(st.nextToken());
				q.offer(back);
			} else if (exec.equals("pop")) {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(q.poll()).append("\n");
				}
			} else if (exec.equals("size")) {
				sb.append(q.size()).append("\n");
			} else if (exec.equals("empty")) {
				if (q.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if (exec.equals("front")) {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(q.peek()).append("\n");
				}
			} else {
				if (q.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
//					Object array[] = new Object[q.size()];
//					array = q.toArray();
//					sb.append(array[q.size()-1]).append("\n");
					sb.append(back).append("\n");
				}
			}
		}
		
		System.out.println(sb.toString());

	}

}
