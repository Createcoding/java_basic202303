package day08.poly.car;

public class Mustang extends Car {

    public void accelerate() {
        System.out.println("머스탱이 달립니다.");
    }


    // 머스탱만의 순수한 기능 - 타입이 올라가면(업캐스팅)으로는 호출불가
    public void powerSound() {
        System.out.println("폭풍같은 배기소리가 납니다.");
    }
}