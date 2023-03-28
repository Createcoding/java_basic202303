package day02;

        /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드

            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */
//입력값.equals("그만")

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] foodList = new String[1];
        System.out.println("음식명을 입력해주세요. ");

        while(true) {
            for (int i = 0; i < foodList.length; i++) {
                if (sc.nextLine().equals("그만")) {
                    break;
                } else {
                    foodList[i] = sc.nextLine();
                    // 만약 음식을 추가하고싶다면? 새배열 생성
                    String[] newFoodList = new String[foodList.length + 1];
                    //  원래있던값 복사
                    for (int j = 0; j < foodList.length + 1; j++) {
                        newFoodList[j] = foodList[j];
                        // 새로운 데이터 넣기
                        newFoodList[newFoodList.length - 1] = sc.nextLine();
                        // 주소복사
                        foodList = newFoodList;
                    }
                }
            }
            System.out.println(Arrays.toString(foodList));
        }



    }
}
