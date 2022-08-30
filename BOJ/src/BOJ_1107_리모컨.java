import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1107_리모컨 {
	static int min = Integer.MAX_VALUE;
	static boolean isWrong[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int target = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		if (N != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			isWrong = new boolean[10];
			for (int i = 0; i < N; i++) {
				isWrong[Integer.parseInt(st.nextToken())] = true;
			}
		} else {
			isWrong = new boolean[10];
			Arrays.fill(isWrong, false);
		}

		if (target == 100) {
			System.out.println(0);
			return;
		}

		// 0번 채널부터 999999채널이 눌러서 갈 수 있는지 조사하고, 갈 수 있다면 100까지의 (+,-) 개수를 구해서 더해줍니다.
		// 0번 채널 ~ 500000 채널까지 있습니다.
		for (int i = 0; i <= 999999; i++) {
			boolean isPossible = true;
			String ch = String.valueOf(i);
			for (int j = 0; j < ch.length(); j++) {
				if (isWrong[ch.charAt(j) - 48]) {
					isPossible = false;
					break;
				}
			}
			if (!isPossible)
				continue;
			if (i < target) {
				int cnt = target - i + ch.length();
				if (cnt < min)
					min = cnt;
			} else {
				int cnt = i - target + ch.length();
				if (cnt < min)
					min = cnt;
			}
		}
		
		if(target >= 100) {
			if(target - 100 < min) min = target - 100;
		} else {
			if(100 - target < min) min = 100 - target;
		}

		System.out.println(min);
	}

}
