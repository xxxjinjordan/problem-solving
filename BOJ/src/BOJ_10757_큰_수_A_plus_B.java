import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10757_큰_수_A_plus_B {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String A = st.nextToken();
		String B = st.nextToken();
		
		String temp = "";
		
		if(A.length() > B.length()) {
			for (int i = 0; i < A.length() - B.length(); i++) {
				temp += "0";
			}
			B = temp + B;
		} else {
			for (int i = 0; i < B.length() - A.length(); i++) {
				temp += "0";
			}
			A = temp + A;
		}
		
		int up = 0;
		String sum = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			int a = A.charAt(i) - 48;
			int b = B.charAt(i) - 48;
			sum += String.valueOf((a + b + up) % 10);
			up = (a + b + up) / 10;
		}
		if(up != 0) sum += up;
		
//		for (int i = sum.length() - 1; i >= 0; i--) {
//			if(i == sum.length() -1 && sum.charAt(i) == '0') continue;
//			sb.append(sum.charAt(i));
//		}
		sb.append(sum);
		
		System.out.println(sb.reverse().toString());
		
	}

}
