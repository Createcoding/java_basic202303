package day10.generic;

import day07.protec.pac1.A;
import day07.protec.pac1.B;
import day09.quiz2해설.Artist;

public class Main {
    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());

        Basket<Apple> apples = new Basket<>();
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana());

        Apple fruit = apples.getFruit();

        Basket<Banana> bananas = new Basket<>();
//        bananas.setFruit(new Apple());
        bananas.setFruit(new Banana());

        MyList<String> sl = new MyList<>();
        sl.push("짬뽕");
        sl.push("짜장");
        sl.push("탕수육");

        System.out.println(sl);

        MyList<Integer> numbers = new MyList<>();
        numbers.push(10);
        numbers.push(28);
        numbers.push(30);

        System.out.println(numbers);

        MyList<Artist> artists = new MyList<>();
//        artists.push(new Artist, ;
    }
}
