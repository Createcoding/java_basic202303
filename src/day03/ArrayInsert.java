package day03;

import java.util.Arrays;

public class ArrayInsert    {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        // 20이랑 30사이에 넣고 싶음
        int newData = 25;  // 2번 인덱스에 넣어야 함

        // 1. 배열의 사이즈 먼저 1 늘려야하니 (사본배열을 만듬)
        int temp[] = new int[arr.length+1];
        // 2. 사본배열에 원본배열을 다 복사.
        for (int i = 0; i < temp.length-1; i++) {
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
        // 3. 맨 뒤부터 타겟 인덱스까지 한칸씩 뒤로(삭제할때는 뒤부터 밀어야함.)
        int target = 5;
        for (int i = target; i < temp.length-1; i++) {
            temp[i+1] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
        //4. 타겟에 새 데이터 넣기
        temp[target] = newData;
        //5. 주소바꾸기
        arr = temp; temp = null;
        System.out.println(Arrays.toString(arr));


    }
}
