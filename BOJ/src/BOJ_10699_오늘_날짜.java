import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class BOJ_10699_오늘_날짜 {
    public static void main(String[] args) {
        // 현재 날짜, 시간 구하기
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(now);

        LocalDate seoulDate = LocalDate.now(ZoneId.of("Asia/Seoul"));

        System.out.println(seoulDate);
    /*
        // 형식 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 포맷 적용
        String formattedNow = now.format(formatter);
        System.out.println(formattedNow);
    */
    }
}