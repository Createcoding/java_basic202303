package day11.api.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateTime {

    public static void main(String[] args) {

//        Date date = new Date();
//        Calendar calendar = Calendar.getInstance();

        // 현재 날짜 정보얻는법(연, 월, 일)
        LocalDate nowData = LocalDate.now();
        System.out.println(nowData);

        // (시, 분, 초)
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        // 연,월,일,시,분,초
        LocalDateTime nowDataTime = LocalDateTime.now();
        System.out.println(nowDataTime);

        // 쪼개서 얻고싶을때
        System.out.println(nowDataTime.getYear());
        System.out.println(nowTime.getHour());

        // (커스텀)특정 날짜 만들기 ex)행사 시작시간
        LocalDateTime targetData = LocalDateTime.of(2023, 5, 5, 9, 0, 0);
        System.out.println(targetData);

        // 날짜 연산
        // ex)도서 대여 시스템. 빌린 날짜로부터 3일 후 반납일
        LocalDateTime rentalData = LocalDateTime.now();
        LocalDateTime returnData = rentalData.plusDays(3);
        System.out.println(returnData);

        // 응용: 1년 2개월 3일 후
        LocalDateTime targetDateTime = returnData.plusYears(1).plusMonths(2).plusDays(3);
        System.out.println(targetDateTime);

        // 사이 날짜 구하기
        LocalDate b = LocalDate.of(2019, 12, 20);
        LocalDate d = LocalDate.of(2023, 3, 10);

        long between = ChronoUnit.DAYS.between(b, d);
        System.out.println(between);

        // 날짜 포멧 바꾸기
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분");

        String dateString = nowDataTime.format(pattern);
        System.out.println(dateString);




    }

}
