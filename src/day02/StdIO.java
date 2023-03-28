package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {

    public static void main(String[] args) throws IOException {

        String dog = "멍멍이", cat = "야옹이";

        System.out.println(dog);
        System.out.println(cat);

        int month = 10;
        int day = 3;
        String anni = "개천절";

        // %d: 정수, %s: 문자열, $f: 실수(줄바꿈은 안됨)
        System.out.printf("%d월 %d일은 %s입니다.\n"
                            ,month, day, anni);

        double rate = 25.4567;
        // %f : 무조건 자리수를 6자리로 표현한다.(자리수 제한해줘야함)
        // %% : 퍼센트표현
        System.out.printf("오늘의 할인율은 %f입니다\n", rate);
        System.out.printf("오늘의 할인율은 %.4f입니다\n", rate);
        System.out.printf("오늘의 할인율은 %.2f%%입니다\n", rate);

        // 표준 입력
        Scanner sc = new Scanner(System.in);

        //일단 문자로 받아라
        String str = sc.nextLine();
        int result = 0;
        try {
            //문자열을 정수로 변환
            result = Integer.parseInt(str);
        } catch (Exception e){
            System.out.println("정수로 입력하거라");
        }

        System.out.println("result = " + result);
    }
}
