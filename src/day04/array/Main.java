package day04.array;

public class Main {

    public static void main(String[] args) {

        StringList foodList = new StringList("제육복음","깍두기");
        foodList.push("짜장면");
        foodList.push("볶음밥");
        foodList.push("탕수육");

        StringList userNameList = new StringList();
        userNameList.push("김철수");
        userNameList.push("박영희");

        foodList.pop();
        userNameList.pop();

        foodList.clear();
        System.out.println("foodList 비었니? " +foodList.isEmpty());


        System.out.println("foodList : " + foodList);
        System.out.println("foodList.size() = " + foodList.size());
        System.out.println("userNameList : " + userNameList);
    }
}
