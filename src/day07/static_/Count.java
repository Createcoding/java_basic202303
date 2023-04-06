package day07.static_;

public class Count {

    // 제한자(modifier)
    // 접근 제한자(Access), 사용 제한자(Usage)
    public static int x;   // 정적(고정) 필드 : 모든 객체가 공유
    public int y;          // 인스턴스(동적) 필드 : 객체별 로 관리


    // 정적 메서드
    public static void m1(){
        System.out.println("static 메서드 호출!");
        // 필드 참조 (static 메서드 안에서는 static 필드만 참조가능!)
        System.out.println("x = " +x);
//        System.out.println("y = " +y);

    }
    // 인스턴스 메서드
    public void m2() {
        System.out.println("인스턴스 메서드 호출!");
    }


}
