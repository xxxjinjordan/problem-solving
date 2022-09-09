import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1259_팰린드롬수 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try{
            while(true){
                String input = br.readLine();
                if(input.equals("0")) break;
                int idx = 0;
                int first = 0;
                int last = input.length() - 1;
                boolean flag = false;
                while(idx != input.length()/2){
                    if(input.charAt(first + idx) != input.charAt(last - idx)){
                        flag = true;
                        break;
                    }
                    idx++;
                }
                if(flag) {
                    sb.append("no").append("\n");
                } else{
                    sb.append("yes").append("\n");
                }
            }
            System.out.println(sb.toString());
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
