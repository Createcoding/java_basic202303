package day01;

public class Casting {
    public static void main(String[] args) {
        byte a = 100;   // 대입도 연산이다
        int b = a;    // 타입이 다르면 연산불가인데 자동형변환되서 가능.


        //
        // +8 : 0001000
        // 1의보수 변환 : 비트 반전
        // -8 : 1110111
        // 2의보수 변환 : +1
        //      11111000


        // MSB : 0은 양수, 1은 음수
        // c: 0 0000000 000000000 00000011 11101000
        int c = 1000;
        // d: 1 1101000
        byte d = (byte)c;         // 이건 자동형변환 안된다.  4바이트(큰집)에서 1바이트(작은집)로 가기에. 명시적변환해야함
        System.out.println("d = " + d);

        // 다운캐스팅은 데이터소실의 위험성이 있다.
        double x = 3.5566;
        int y = (int) x;
        System.out.println("y = " + y);


        // 타입이 다른 데이터의 연산
        // 타입이 다르면 큰타입(큰집이어야 둘다 들어가지~) 의 맞춰서 연산.
        int k = 100;
        double j = 5.5;

        double v = k + j;

        char c1 = 'A';
        int alpha = 1;
        System.out.println(c1+alpha);

        // int 보다 작은데이터(byte,short,char) 끼리의 연산은
        // 무조건 둘다 int로 변환되서 연산(안전한 처리를위해)

        byte b1 = 100;
        byte b2 = 20;

        int b3 = b1 * b2;

        int g = 24;
        double result = g / 5;
        System.out.println(result);
    }
}
