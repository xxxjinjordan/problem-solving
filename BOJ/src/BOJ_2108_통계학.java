import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_2108_통계학 {
    static int sum, max, min;
    static int array[];
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            int N = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            int count[][] = new int[2][4001];

            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            int maxCnt = 0;

            for (int i = 0; i < N; i++) {
                int input = Integer.parseInt(br.readLine());
                sum += input;
                if(input > max) max = input;
                if(input < min) min = input;
                list.add(input);
                if(input == 0){
                    count[0][0]++;
                    if(count[0][0] > maxCnt)maxCnt = count[0][0];
                } else if(input > 0){
                    count[0][input]++;
                    if(count[0][input] > maxCnt)maxCnt = count[0][input];
                } else{
                    count[1][input * (-1)]++;
                    if(count[1][input * (-1)] > maxCnt)maxCnt = count[1][input * (-1)];
                }
            }

            ArrayList<Integer> maxList = new ArrayList<>();
            for (int i = 0; i < count.length; i++) {
                for (int j = 0; j < count[0].length; j++) {
                    if(i == 1 && j == 0) continue;
                    if(count[i][j] == maxCnt) {
                        if(i == 0) maxList.add(j);
                        else maxList.add(j * (-1));
                    }
                }
            }

            Collections.sort(maxList);

            Collections.sort(list);

            // 1. 산술평균
            sb.append(Math.round(sum / (double)N)).append("\n");
            // 2. 중앙값
            sb.append(list.get(N/2)).append("\n");
            // 3. 최빈값
            if(maxList.size() > 1) {
                sb.append(maxList.get(1)).append("\n");
            } else {
                sb.append(maxList.get(0)).append("\n");
            }
            // 4. 범위
            sb.append(max - min).append("\n");
            System.out.println(sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
