import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 주석 처리 된 것은 DP 풀이입니다. 주석 처리 되지 않은 것은 Greedy 풀이입니다.
public class BOJ_2839_설탕_배달 {
//    static int array[] = new int[5001];

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(br.readLine());

            int temp = N / 5;

            int a = -1;
            int b = -1;

            if(N % 5 == 0){
                System.out.println(temp);
                return;
            } else{
                while(true){
                    int k = N;
                    k = k - 5 * temp;
                    if(k % 3 == 0) {
                        a = temp;
                        b = k / 3;
                        break;
                    }
                    temp--;
                    if(temp == -1) break;
                }
            }
            if(a == -1 || b == -1) System.out.println(-1);
            else System.out.println(a + b);
//            Arrays.fill(array, -1);
//            array[3] = 1;
//            array[5] = 1;
//
//            for (int i = 6; i < array.length; i++) {
//                int beforeThree = array[i - 3];
//                int beforeFive = array[i - 5];
//
//                int min = Integer.MAX_VALUE;
//
//                if (beforeThree == -1 && beforeFive == -1) {
//                    continue;
//                } else if (beforeThree == -1 && beforeFive != -1) {
//                    min = beforeFive + 1;
//                } else if (beforeThree != -1 && beforeFive == -1) {
//                    min = beforeThree + 1;
//                } else {
//                    min = beforeThree > beforeFive ? beforeFive : beforeThree;
//                    min++;
//                }
//
//                array[i] = min;
//            }
//
//            System.out.println(array[N]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
