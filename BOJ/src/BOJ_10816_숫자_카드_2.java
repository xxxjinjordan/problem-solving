import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10816_숫자_카드_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		int cards[] = new int[N];
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < cards.length; i++) {
//			cards[i] = Integer.parseInt(st.nextToken());
//		}
//		Arrays.sort(cards);
//		
//		int M = Integer.parseInt(br.readLine());
//		st = new StringTokenizer(br.readLine());
//		for (int i = 0; i < M; i++) {
//			int target = Integer.parseInt(st.nextToken());
//		}
//		
//		System.out.println(sb.toString());
	}


}

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_10816_숫자_카드_@ {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int card = Integer.parseInt(st.nextToken());
			if (map.get(card) == null) {
				map.put(card, 1);
			} else {
				map.replace(card, map.get(card) + 1);
			}
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int target = Integer.parseInt(st.nextToken());
			if (map.get(target) == null) {
				sb.append(0).append(" ");
			} else {
				sb.append(map.get(target)).append(" ");
			}
		}

		System.out.println(sb.toString());
	}

}
 */
