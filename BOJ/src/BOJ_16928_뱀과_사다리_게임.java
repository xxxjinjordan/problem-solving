import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_16928_뱀과_사다리_게임 {
	static int move[] = new int[101];
	static boolean visited[] = new boolean[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int cnt = 0;

		for (int i = 0; i < N + M; i++) {
			st = new StringTokenizer(br.readLine());
			move[Integer.parseInt(st.nextToken())] = Integer.parseInt(st.nextToken());
		}

		Queue<Integer> q = new LinkedList<Integer>();
		visited[1] = true;
		q.offer(1);

		while (!q.isEmpty()) {
			int size = q.size();
			cnt++;
			while (size > 0) {
				int now = q.poll();
				
				for (int i = 1; i <= 6; i++) {
					int next = now + i;
					if(next == 100) {
						System.out.println(cnt);
						System.exit(0);
					}

					if (next > 100 || visited[next])
						continue;

					if (move[next] != 0) {
						visited[next] = true;
						visited[move[next]] = true;
						q.offer(move[next]);
					} else {
						visited[next] = true;
						q.offer(next);
					}

				}
				size--;
			}
		}

		System.out.println(cnt);

	}

}
