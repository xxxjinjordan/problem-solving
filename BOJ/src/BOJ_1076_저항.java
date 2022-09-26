import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_1076_저항 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1);
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String first = br.readLine();
            String second = br.readLine();
            String third = br.readLine();
            long sum = (map.get(first) * 10 + map.get(second)) * (long) Math.pow(10, map.get(third));
            System.out.println(sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
