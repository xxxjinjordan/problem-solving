import java.io.*;

public class BOJ_10989_수_정렬하기_3 {
    static int count[] = new int[10001];
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < N; i++) {
                count[Integer.parseInt(br.readLine())]++;
            }
            for (int i = 1; i < count.length; i++) {
                if(count[i] == 0)continue;
                else {
                    for (int j = 0; j < count[i]; j++) {
                        bw.write(i+"\n");
                    }
                }
            }
            bw.flush();
            bw.close();
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
