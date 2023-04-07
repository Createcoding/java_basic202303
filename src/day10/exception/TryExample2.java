package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("정수1: ");
            int n1 = sc.nextInt();  // InputMismatchException

            System.out.print("정수2: ");
            String strN2 = sc.next();
            int n2 = Integer.parseInt(strN2);   // NumberFormatException - 문자열을 숫자로변환해주는데 숫자가있어야만 변환된다.

            int result = n1 / n2;   // ArithmeticException
            System.out.println("result =" + result);
        } catch (InputMismatchException e) {
            System.out.println("첫번째 숫자는 정수로만 입력해주세요!");
        } catch (NumberFormatException e) {
            System.out.println("두번째 숫자도 정수로만 입력해주세요!");
        } catch (Exception e) {
            System.out.println("알 수 없는 에러입니다. 관리자에게 문의하세요!");  // 마지막에 전체오류 에대해 종합보험걸자.
        }
        System.out.println("프로그램 정상 종료");
    }


}
