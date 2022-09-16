import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949_균형잡힌_세상 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            while(true) {
                String input = br.readLine();
                if(input.equals(".")) break;
                Stack<Character> stack = new Stack<>();
                boolean flag = false;

                for (int i = 0; i < input.length(); i++) {
                    char c = input.charAt(i);
                    if(c == '['){
                        stack.push(c);
                    } else if(c == '('){
                        stack.push(c);
                    } else if(c == ']'){
                        if(stack.size() == 0){
                            sb.append("no").append("\n");
                            flag = true;
                            break;
                        }
                        char temp = stack.pop();
                        if(temp != '['){
                            sb.append("no").append("\n");
                            flag = true;
                            break;
                        }
                    } else if(c == ')'){
                        if(stack.size() == 0){
                            sb.append("no").append("\n");
                            flag = true;
                            break;
                        }
                        char temp = stack.pop();
                        if(temp != '('){
                            sb.append("no").append("\n");
                            flag = true;
                            break;
                        }
                    } else continue;
                }

                // 반례: "((())" 오른쪽 괄호가 나왔을 때마다 잘 닫아졌지만, 남는 왼쪽 괄호가 있을 수 있다.
                // 따라서 스택 사이즈를 최종 확인하여, 모두 짝이 찾아졌는지 확인할 필요가 있다.
                if(!flag){
                    if(stack.size() == 0) sb.append("yes").append("\n");
                    else sb.append("no").append("\n");
                }

            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
