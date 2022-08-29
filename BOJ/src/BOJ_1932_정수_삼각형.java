import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932_정수_삼각형 {
	static int N;
	static int memo[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		N = Integer.parseInt(br.readLine());
		memo = new int[N][N];
		int tri[][] = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			int idx = 0;
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				memo[i][idx] = -1;
				tri[i][idx++] = Integer.parseInt(st.nextToken());
			}
		}
		
		int ans = getMax(tri, 0, 0);
		System.out.println(ans);
	}

	private static int getMax(int[][] bTree, int idx, int depth) {
		if(memo[depth][idx] != -1) return memo[depth][idx];
		
		if(depth == N - 1) {
			return memo[depth][idx] = bTree[depth][idx];
		}
		
		int left = getMax(bTree, idx, depth + 1);
		int right = getMax(bTree, idx + 1, depth + 1);
		
		if(left > right) return memo[depth][idx] = left + bTree[depth][idx];
		else return memo[depth][idx] = right + bTree[depth][idx];
	}

}
