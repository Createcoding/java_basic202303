package day04;

// 실행용 클래스
// 여기엔 설계를 하지 않고 main메서드를 작성합니다.
public class DancerMain {

    public static void main(String[] args) {
        // Dancer클래스는 정해진 타입(접시그릇)이 없으니까 만들어준다.
        // 댄서타입(그릇)을 만들어서쓴다.
        Dancer kim = new Dancer();
        Dancer park = new Dancer("스트릿댄스");
        Dancer jang = new Dancer("장동건", "목각댄스", DanceLevel.BEGINNER);
        // new로 댄서의 생성자를 불러서 호출한것.   댄서안에는 필드들이 배치되있음
        // 변수에 주소저장.
        Singer song = new Singer();


        // 클래스에 접근하는법 변수이름.
        System.out.println(kim.introduce());
        System.out.println(park.introduce());
        System.out.println(jang.introduce());

        kim.dance();
        park.dance();
        jang.dance();
    }
}
