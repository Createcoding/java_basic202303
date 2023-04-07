package day10.generic;

public class Basket<F>{  // 담고싶은 과일을 나중에 알려줘<>  상속안받아도 쓸수있다.(보통 한글자로 표현)

    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }
}
