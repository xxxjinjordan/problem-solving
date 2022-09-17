import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874_스택_수열 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        try {
            int N = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();
            int last = 0;
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(br.readLine());
                if(last < num){
                    for (int j = last + 1; j <= num; j++) {
                        stack.push(j);
                        sb.append("+").append("\n");
                    }
                    last = stack.pop();
                    sb.append("-").append("\n");
                } else {
                    if(stack.peek() == num){
                        sb.append("-").append("\n");
                        stack.pop();
                    } else{
                        flag = false;
                        break;
                    }
                }
            }
            if(!flag){
                System.out.println("NO");
            } else{
                System.out.println(sb.toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
