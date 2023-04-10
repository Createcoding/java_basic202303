package day11.api.obj;

import java.util.List;
import java.util.Objects;

public class Pen extends Object {

    Company company;  // 제조 회사

    // String 은 lang 이라서 import 생략가능
    long serial;  // 시리얼 번호
    String color;   // 색상
    int price;    // 가격

    public Pen(long serial, String color, int price) {
        serial = serial;
        this.color = color;
        this.price = price;
    }
    // 객체의 필드데이터를 빠르게 확인해볼때


    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", Serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    //시리얼번호가 같으면 같은 객체로 보고싶을때
    // equals를 오버라이딩 하면 반드시 hashCode 도 같이 오버라이딩 해라
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pen) {
            Pen target = (Pen) obj;
            return this.serial == target.serial;
        }
        return false;
    }
    // 시리얼과 컬러가 같으면 해쉬코드 같게 보고싶을때
    @Override
    public int hashCode() {
        return Objects.hash(serial, color);
    }
}

