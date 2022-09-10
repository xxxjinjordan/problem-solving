import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Member implements Comparable<Member>{
    int age;
    String name;
    int regOrder;

    public Member(int age, String name, int regOrder) {
        this.age = age;
        this.name = name;
        this.regOrder = regOrder;
    }

    @Override
    public int compareTo(Member o) {
        if(o.age == this.age){
            return this.regOrder - o.regOrder;
        } else{
            return this.age - o.age;
        }
    }
}

public class BOJ_10814_나이순_정렬 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try{
            int N = Integer.parseInt(br.readLine());
            ArrayList<Member> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int age = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                int order = i;
                list.add(new Member(age, name, order));
            }
            Collections.sort(list);
            for(Member m : list){
                sb.append(m.age).append(" ").append(m.name).append("\n");
            }
            System.out.println(sb.toString());
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
