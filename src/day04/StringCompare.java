package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String myName = "홍길동";
        System.out.println("이름을 입력해주세요.");
        String inputName = sc.nextLine();

        System.out.println("myName = " +myName);
        System.out.println("inputName = " +inputName);

        // 기본타입 말고는 전부 equals() 로 구분함
        if(myName.equals(inputName)){
            System.out.println("두이름이 일치함");
        } else {
            System.out.println("두이름이 일치하지않음");
        }

    }
}
