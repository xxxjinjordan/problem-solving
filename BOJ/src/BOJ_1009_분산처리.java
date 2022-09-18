import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1009_분산처리 {
    static int table[][] = new int[10][4];
    public static void main(String[] args) {
        // 0: 0, 0, 0, 0
        // 1: 1, 1, 1, 1
        // 2: 2, 4, 8, 6
        // 3: 3, 9, 7, 1
        // 4: 4, 6, 4, 6
        // 5: 5, 5, 5, 5
        // 6: 6, 6, 6, 6
        // 7: 7, 9, 3, 1
        // 8: 8, 4, 2, 6
        // 9: 9, 1, 9, 1
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                table[i][j] = (int) Math.pow(i, j + 1) % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        try {
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i < T; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                b--;
                a %= 10;
                b %= 4;
                if(table[a][b] == 0) sb.append(10).append("\n");
                else
                sb.append(table[a][b]).append("\n");
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
