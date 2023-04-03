package day06.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");

        myCar.setSpeed(150);
        System.out.println(myCar.getSpeed());

        myCar.pressButton();
//        myCar.inject();
//        myCar.putOil();
//        myCar.moveCylinder();
    }

}
