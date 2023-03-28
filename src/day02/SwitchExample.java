package day02;

import java.util.Scanner;

public class SwitchExample {

    // 자바 상수
    public static final String SPRING = "봄";

    public static void main(String[] args) {

        System.out.println("### 여행지 추천 ###");
        System.out.println("[ 원하는 계절을 입력하세요. ] ");
        System.out.print(">> "); // 봄, 여름, 가을, 겨울

        Scanner sc = new Scanner(System.in);

        String season = sc.nextLine();
        double d = 3.14145;

        //switch 문 ()에는 정수(실수x), 문자형 변수를 써야 합니다.
        //case 는 무조건 상수(변하면안된다=변수불가)써야함.
        switch (season) {
            case SPRING:
                System.out.println("봄에는 여의도를 가세요!");
                break;  // switch문 탈출
            case "여름":  // break 없으니 코드가 아래로 진행
                // summer 도 조건걸림.
            case "summer":
            case "여름 ":
                System.out.println("여름에는 홍천을 가세요!");
                break;
            case "가을":
                System.out.println("가을에는 춘천을 가세요!");
                break;
            case "겨울":
                System.out.println("겨울에는 스키장을 가세요!");
                break;
            default: // else 와 같은효과
                System.out.println("계절을 잘 입력하세요.^^");
        }
        System.out.println("=====================");

        System.out.print("정말로 종료합니까? [y/n] >>");
        String answer = sc.nextLine();

        switch (answer.toLowerCase().charAt(0)) { //대문자로 써도 소문자로 변환되도록
            // 앞글자로만 조건검사.
            case 'y':
                System.out.println("종료합니다");
                break;
            case 'n':
                System.out.println("취소합니다!");
                break;

        }
    }
}
