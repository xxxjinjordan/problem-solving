import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Print{
	int pri;
	boolean target;
	
	public Print(int pri, boolean target) {
		super();
		this.pri = pri;
		this.target = target;
	}
	
}

public class BOJ_1966_프린터_큐 {
	static int N, M;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		for (int testcase = 1; testcase <= TC; testcase++) {
			Queue<Print> q = new LinkedList<Print>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				boolean target = false;
				if(i == M) target = true;
				Print print = new Print(Integer.parseInt(st.nextToken()), target);
				q.offer(print);
			}
			int order = 0;
			
			while(!q.isEmpty()) {
				boolean hasBigger = false;
				int frontNum = q.peek().pri;
				
				// 현재 인쇄하려고 하는 종이보다 우선순위가 높은 종이가 있는지 확인
				for (int i = 0; i < N; i++) {
					Print checkPrint = q.poll();
					if(checkPrint.pri > frontNum) {
						hasBigger = true;
					}
					q.offer(checkPrint);
				}
				
				if(hasBigger) {
					q.offer(q.poll());
				} else {
					order++;
					Print print = q.poll();
					N--;
					if(print.target == true) {
						System.out.println(order);
					}
				}
			}
		}
	}
	

}
