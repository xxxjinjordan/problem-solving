import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2751_수_정렬하기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(br.readLine());
            list.add(temp);
        }

        Collections.sort(list);
//        내림차순 정렬
//        Collections.sort(list, Collections.reverseOrder());

        for (Integer n : list) {
            sb.append(n).append("\n");
        }

        System.out.println(sb.toString());
    }
}
