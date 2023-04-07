package day10.collection.list;
/*
    - 저장 데이터의 순서를 보장
    - 인덱스를 가지고 있음
    - 중복 데이터를 저장 가능
 */

import day07.util.Utility;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        List<String> foodList = new ArrayList<>();

        // add(E e) : 끝 추가
        foodList.add("짜장면");
        foodList.add("짬뽕");
        foodList.add("닭강정");
        foodList.add("파스타");
        foodList.add("리조또");

        // add(index, element) : 중간 삽입
        foodList.add(1, "탕수육");

        // size() :  저장된 데이터 개수를 반환
        int size = foodList.size();
        System.out.println(size);

        System.out.println(foodList); // toString 생략가능.

        // indexOf(E e) : 해당 데이터의 인덱스 반환
        int index = foodList.indexOf("파스타");
        System.out.println(index);

        // contains(E e) : 해당 데이터 저장 유무 확인
        System.out.println(foodList.contains("짜장면"));
        System.out.println(foodList.contains("마파두부"));

        // remove(index), remove(obj)  -- 오버로딩되있어서 둘다 사용가능
        String removeFood = foodList.remove(1);  // 지운데이터 추출가능.
        foodList.remove("짬뽕");

        System.out.println(foodList);

        // set(index, newElement) : 수정
        foodList.set(0, "동파육");
        System.out.println(foodList);

        // get(index) : List에 저장된 데이터 참조
        String s = foodList.get(1);
        System.out.println(s);


        // 반복문 처리
        Utility.makeLine();
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }
        Utility.makeLine();
        for (String food : foodList) {
            System.out.println(food);
        }

        // clear() : 내부 데이터 전체삭제
        foodList.clear();
        System.out.println(foodList);

        // isEmpty() : 비었는지 확인
        System.out.println(foodList.isEmpty());

        // 리스트에 초기값 넣고 시작하기 : 생성자에 배열 넣을수있다.
        ArrayList<String> tvxq = new ArrayList<>(
                Arrays.asList("유노윤호", "최강창민")
        );
        System.out.println(tvxq);

        // 정렬 (듀얼 피벗 퀵 정렬)
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(5, 30, 17, 9, 52, 41)
        );
        Utility.makeLine();
        System.out.println(numbers);

        // 오름차 정렬
        Collections.sort(numbers);
        System.out.println(numbers);

        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers);
    }
}
