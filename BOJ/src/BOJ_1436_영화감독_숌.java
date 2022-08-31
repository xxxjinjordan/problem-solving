import java.util.Scanner;

public class BOJ_1436_영화감독_숌 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int target = 1;
		int idx = 0;
		int ans = -1;
		
		while(true) {
			String check = String.valueOf(target);
			if(check.contains("666")) {
				idx++;
				if(idx == N) {
					ans = target;
					break;
				}
			}
			target++;
		}
		
		System.out.println(ans);
	}

}
