package day10.workshop13;

import day06.modi.pac2.C;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 넓이와 둘레는 소수점 첫 자리에서 반올림 한다. 구분 길이 X좌표 Y좌표 Area Circumference
Rectangle 4 7 5 16 16
Rectangle 5 4 6 25 20
Circle 6 6 7 113 38
Circle 7 8 3 154 44
이동 후...
Rectangle 4 19 17
Rectangle 5 16 18
Circle 6 17 18
Circle 7 19 14
 */
public class ShapeTest {

    public static void main(String[] args) {
        // ArrayList를 만들어 [1.사용데이터]의 객체의 순서대로 Circle 객체와 Rectangle
        // 객체를 생성하여 넣는다

        List<Shape> Area = new ArrayList<>();

        Area.add(new Circle(6,6,7));
        Area.add(new Circle(7,8,3));
        Area.add(new Rectangle(4,7,5));
        Area.add(new Rectangle(5,6,4));

        // 모든 객체의 넓이 정보와 둘레 정보를 화면에 출력 한다. – for 문 이용
        for (Shape shape : Area) {
            System.out.printf("넓이,둘레 %.2f" ,shape.getArea(),shape.getCircumference());
        }
        System.out.println("이동 후");
        // 모든 객체들에 move()함수를 이용하여 x가 10증가, y가 10증가


        // 되도록 변경 한 후 객체 정보를 화면에 출력 한다. – for 문 이용


    }
}
