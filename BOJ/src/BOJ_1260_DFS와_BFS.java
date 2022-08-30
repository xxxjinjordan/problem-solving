import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260_DFS와_BFS {
	static int N, M, V;
	static boolean adj[][];
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();
		// 정점의 개수 N
		N = Integer.parseInt(st.nextToken());
		// 간선의 개수 M
		M = Integer.parseInt(st.nextToken());
		// 탐색을 시작할 정점 V
		V = Integer.parseInt(st.nextToken());

		// 인접 행렬 선언
		adj = new boolean[N + 1][N + 1];
		
		boolean visited[] = new boolean[N + 1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			adj[r][c] = true;
			adj[c][r] = true;
		}
		
		sb.append(V).append(" ");
		visited[V] = true;
		dfs(V, visited);
		System.out.println(sb.toString());
		bfs(V);
	}

	private static void bfs(int start) {
		boolean visited[] = new boolean[N + 1];
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<Integer>();
		visited[start] = true;
		q.offer(start);
		
		while(!q.isEmpty()) {
			int front = q.poll();
			sb.append(front).append(" ");
			
			for (int i = 1; i <= N; i++) {
				if(adj[front][i] && !visited[i]) {
					visited[i] = true;
					q.offer(i);
				}
			}
		}
		
		System.out.println(sb.toString());
	}

	private static void dfs(int start, boolean visited[]) {
		for(int i=1; i<=N; i++) {
			if(!visited[i] && adj[start][i]) {
				visited[i] = true;
				sb.append(i).append(" ");
				dfs(i, visited);
			}
		}
	}

}
