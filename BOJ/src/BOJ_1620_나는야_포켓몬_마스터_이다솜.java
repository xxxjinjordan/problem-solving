import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1620_나는야_포켓몬_마스터_이다솜 {

	public static void main(String[] args) throws IOException {
		Map<String, Integer> map = new HashMap<String, Integer>();
//		Map<Integer, String> map2 = new HashMap<Integer, String>();
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String pokedex[] = new String[N + 1];
		
		for (int i = 0; i < N; i++) {
			String pokemon = br.readLine();
			map.put(pokemon, i + 1);
//			map2.put(i + 1, pokemon);
			pokedex[i + 1] = pokemon;
		}
		
		for (int i = 0; i < M; i++) {
			String target = br.readLine();
			if(target.charAt(0) >= 65) {
				sb.append(map.get(target)).append("\n");
//				System.out.println(map.get(target));
			} else {
				int numTarget = Integer.parseInt(target);
//				sb.append(map2.get(numTarget)).append("\n");
				sb.append(pokedex[numTarget]).append("\n");
//				System.out.println(map2.get(numTarget));
//				System.out.println(pokedex[numTarget]);
			}
		}
		System.out.println(sb.toString());
	}

}
