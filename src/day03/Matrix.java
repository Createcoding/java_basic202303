package day03;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int korScore = 10;
        int mathScore = 20;
        int engScore = 30;

        // 변수이름을 여러개 설정하면 관리하기 힘들기에 배열을 만듬.
        int[] kimScores = {korScore, mathScore, engScore};
        int[] parkScores = {100, 34, 99};
        int[] hongScores = {78, 80, 90};
        // 1차원배열로도 힘들때 2차원배열(1차원배열을 묶은것) 이용
        int[][] classScores = {kimScores, parkScores, hongScores};

        //타입 : 배열
        System.out.println(classScores[0]);
        //타입 : int
        System.out.println(kimScores[0]);

        System.out.println(Arrays.toString(classScores));
        System.out.println(Arrays.deepToString(classScores));

        // 2차원배열의 값 초기화
        int[][] arr2d = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 200, 300}
        };
        System.out.println("===============");
        System.out.println(arr2d[1][2]);

        //2차원 배열 순회
        for (int[] arr : arr2d) { //2차원배열에서 1차원 배열을꺼내고
            for (int n : arr) {  //1차원배열에서 int 를 꺼낸다
                System.out.printf("%3d ", n);
            }
            System.out.println();
        }

        // 배열의 기본값 : 0 (double,float 일때만 0.0)

        char[] numbers = new char[5];
        System.out.println("=====================");
        System.out.println(Arrays.toString(numbers));

        // 5행 4열의 정수 2차원배열을 생성
        int[][] array2d = new int[5][4];

        // 2차원 배열의 수정
        // array2d 의 값을 변경하고싶을때
        array2d[1][3] = 99;
        array2d[2][1] = 55;
        // 1차원 배열 수정
        array2d[3] = new int[] {9, 8, 7, 6};

        // 값 출력
        for (int[] arr : array2d) {
            for (int n : arr) {
                System.out.printf("%3d ", n);
            }
            System.out.println();

        }
        System.out.println(Arrays.deepToString(array2d));

    }

}
