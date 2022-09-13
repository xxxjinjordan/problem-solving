import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_10773_제로 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int K = Integer.parseInt(br.readLine());
            for (int i = 0; i < K; i++) {
                int N = Integer.parseInt(br.readLine());
                if(N != 0){
                    list.add(N);
                } else{
                    list.remove(list.size() -1);
                }
            }
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
