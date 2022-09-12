import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_10828_스택 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            int N = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            // 명령어 수행
            for (int i = 0; i < N; i++) {
                String input = br.readLine();
                String exec = input.substring(0, 2);
                switch (exec) {
                    case "pu":
                        StringTokenizer st = new StringTokenizer(input);
                        st.nextToken();
                        int val = Integer.parseInt(st.nextToken());
                        stack.push(val);
                        break;
                    case "po":
                        if (stack.size() == 0) {
                            sb.append(-1).append("\n");
                        } else {
                            int pop = stack.pop();
                            sb.append(pop).append("\n");
                        }
                        break;
                    case "si":
                        sb.append(stack.size()).append("\n");
                        break;
                    case "em":
                        if (stack.size() == 0) {
                            sb.append(1).append("\n");
                        } else {
                            sb.append(0).append("\n");
                        }
                        break;
                    case "to":
                        if (stack.size() == 0) {
                            sb.append(-1).append("\n");
                        } else {
                            int peek = stack.peek();
                            sb.append(peek).append("\n");
                        }
                        break;

                }
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
