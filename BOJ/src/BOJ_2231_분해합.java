import java.util.Scanner;

public class BOJ_2231_분해합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int ans = 0;
		boolean flag = false;
		while(ans <= N) {
			ans++;
			int sum = ans;
			int temp = ans;
			while(temp > 0) {
				sum += temp % 10;
				temp /= 10;
			}
			if(sum == N) {
				flag = true;
				break;
			}
			
		}
		if(!flag) ans = 0;
		System.out.println(ans);
	}

}
