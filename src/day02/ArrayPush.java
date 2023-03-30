package day02;

import java.util.Arrays;

public class ArrayPush {
    public static void push(int newData) {
        // 1. 원본배열보다 1개 사이즈가 더 큰 새 배열 생성
        int[] temp = new int[arr.length + 1];

        // 2. 새로운방으로 원본배열 데이터 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        // 3. 새로운데이터 새배열에 끝 인덱스에 추가
        temp[temp.length - 1] = newData;

        // 4. 주소값 이전, temp 주소날리기
        arr = temp;
        temp = null;

    }

    // 배열은 한번 방 크기가 정해지면 나중에 바꿀수없다.
    static int[] arr = {10, 20, 30};

    public static void main(String[] args) {


        // 40을 배열 끝에 넣고싶을때->큰방으로 바꿔라
        int newData = 40;

//        // 1. 원본배열보다 1개 사이즈가 더 큰 새 배열 생성
//        int[] temp = new int[arr.length+1];
//
//        // 2. 새로운방으로 원본배열 데이터 복사
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        // 3. 새로운데이터 새배열에 끝 인덱스에 추가
//        temp[temp.length-1] = newData;
//
//        // 4. 주소값 이전, temp 주소날리기
//        arr = temp;
//        temp = null;

        System.out.println(Arrays.toString(arr));
    }
}
