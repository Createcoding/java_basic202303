package day06.modi.pac1;

public class B {

    void test() {
        A a = new A();
        a.f1 = 1;   // public
        a.f2 = 2;   // default
        // a.f3 = 3;   // private

        a.m1();    // public
        a.m2();    // default
        //  a.m3();   // private

    }
}
