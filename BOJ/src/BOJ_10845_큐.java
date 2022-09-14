import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845_큐 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringBuilder sb = new StringBuilder();
            Queue<Integer> q = new LinkedList<>();
            int N = Integer.parseInt(br.readLine());
            int last = -1;
            for (int i = 0; i < N; i++) {
                String input = br.readLine();
                String op = input.substring(0, 2);

                switch(op){
                    case "pu":
                        StringTokenizer st = new StringTokenizer(input);
                        st.nextToken();
                        int num = Integer.parseInt(st.nextToken());
                        q.offer(num);
                        last = num;
                        break;
                    case "po":
                        if(q.size() == 0){
                            sb.append(-1).append("\n");
                        } else{
                            int pop = q.poll();
                            sb.append(pop).append("\n");
                        }
                        break;
                    case "si":
                        sb.append(q.size()).append("\n");
                        break;
                    case "em":
                        if(q.size() == 0){
                            sb.append(1).append("\n");
                        } else{
                            sb.append(0).append("\n");
                        }
                        break;
                    case "fr":
                        if(q.size() == 0){
                            sb.append(-1).append("\n");
                        } else{
                            sb.append(q.peek()).append("\n");
                        }
                        break;
                    case "ba":
                        if(q.size() == 0){
                            sb.append(-1).append("\n");
                        } else{
                            sb.append(last).append("\n");
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
