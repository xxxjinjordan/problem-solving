import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_10866_덱 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            char lastChar = input.charAt(input.length() - 1);
            String op = null;
            Integer val = null;

            // push 연산이 시행되는 경우
            if (lastChar >= '0' && lastChar <= '9') {
                StringTokenizer st = new StringTokenizer(input);
                op = st.nextToken();
                val = Integer.parseInt(st.nextToken());
            } else {
                op = input;
            }

            // 연산 switch
            switch (op) {
                case "push_back":
                    dq.addLast(val);
                    break;
                case "push_front":
                    dq.addFirst(val);
                    break;
                case "front":
                    if (dq.size() == 0) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(dq.peekFirst()).append("\n");
                    }
                    break;
                case "back":
                    if (dq.size() == 0) {
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(dq.peekLast()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(dq.size()).append("\n");
                    break;
                case "empty":
                    if (dq.size() == 0) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "pop_front":
                    if(dq.size() == 0){
                        sb.append(-1).append("\n");
                    } else{
                        int num = dq.pollFirst();
                        sb.append(num).append("\n");
                    }
                    break;
                case "pop_back":
                    if(dq.size() == 0){
                        sb.append(-1).append("\n");
                    } else{
                        int num = dq.pollLast();
                        sb.append(num).append("\n");
                    }
                    break;
                default:
                    System.out.println("잘못된 접근입니다.");
                    System.exit(0);
            }
        }
        System.out.println(sb.toString());
    }
}
