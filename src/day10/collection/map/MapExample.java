package day10.collection.map;

import day07.util.Utility;
import day09.quiz2해설.Artist;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        // put(K, V) : 데이터 추가
        map.put("지갑잔액", 5000);
//        map.put("좋아하는 가수", new Artist();


        System.out.println(map.size());

        // get(key) : 데이터 참조
        Object dinner = map.get("저녁메뉴");
        System.out.println("dinner = " +dinner);

        Artist artist = (Artist) map.get("좋아하는 가수");
        artist.info();

        System.out.println(map);

        map.put("저녁메뉴","짬뽕");
        System.out.println(map);

        // 반복문 처리 - index없어서 fori 사용불가
        for(String key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
            Utility.makeLine();
        }

    }
}
