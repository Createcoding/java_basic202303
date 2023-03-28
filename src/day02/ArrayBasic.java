package day02;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // 배열 객체 생성
        // 동종모음 구조(같은타입)
        int[] arr = new int[5];  // arr의타입은 int 배열타입(8byte)
        // arr은 주소일뿐이다 5명이 들어가는 방의 주소.
        System.out.println(arr);
        // 방안에 사람(값)을 넣어줘야한다.
        arr[0] = 50;
        arr[1] = 77;
        arr[2] = arr[0] + 20;
        arr[3] = (int) 66.7;
        arr[4] = 100;
        // arr[5] = 50; // 런타임에러 (빨간줄x. 실행하면 에러 걸리는것)

        // 배열의 길이 - 저장 데이터 개수
        // 자바의 배열 immutable(불변성)
        // 방의개수 5개 저장되면 5명만 들어갈수있다.

        System.out.printf("배열의 길이: %d\n", arr.length);

        // 배열 반복문 처리(단축키 : fori)
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번 데이터 :%d\n", i + 1, arr[i]);
        }

        // foreach문(단축키 : iter)
        System.out.println("==============");
        // of 대신 :
        for (int n : arr) {
            System.out.printf("데이터 : %d\n", n);
            //alt + enter 로 여러가지 문으로 바꾸기 가능
        }

        // 배열 내부데이터 문자열로 출력
        System.out.println(Arrays.toString(arr));


    }

}
