package day09.abs;

public class Dog extends Pet{

    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void takeNap() {
        System.out.println("강아지는 마당에서 낮잠을 자요~");
    }

    public void eat() {
        System.out.println("강아지는 사료를 먹어요");
    }
    // 오버라이딩을 위한 메서드


}
