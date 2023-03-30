package day04;

// 댄서의 설계도(속성, 기능)
// 설계도에는 main(실행기)을 만들지 않습니다.
public class Dancer {

    // 속성(필드 라고한다) : 필드는 heap에 저장되서 사라지지않음.   변수는 스택에 저장되서 생성이 끝나면 사라짐.
    String dancerName;  // 값을 설정하진 않는다.
    String crewName;   // 댄스크루 이름
    String genre;     // 댄스 장르
    DanceLevel level;       // 춤 수준( 0: 초보자, 1: 중수, 2: 고수)

    // =====================================================================

    // 생성자 : 스카우터(댄서섭외자),개발자(공돌이),기술자 - 객체 생성시 필요한 데이터를 셋팅.
    // 클래스이름과 똑같이만들면 생성자로 인식
    // 생성자도 함수개념,리턴이 void로 고정되서 굳이 쓰지않는다
    // 리턴값은 생성한 객체의 주소값을 리턴
    Dancer(){
        dancerName = "갑돌이";
        crewName = "돌아이들";
        genre = "아이돌댄스";
        level = DanceLevel.AMATUER;
    }

    // 장르를 구분해서 데려오는 스카우트(생성자 오버로딩)
    Dancer(String dgenre){
        dancerName = "관종킹";
        crewName = "써커스왕";
        genre = dgenre;
        level = DanceLevel.BEGINNER;
    }
    // 모든것을 구분해서 데려오는 스카우트(생성자 오버로딩)
    Dancer(String dName, String dGenre, DanceLevel dLevel){
        dancerName = dName;
        crewName = "하하호호";
        genre = dGenre;
        level = dLevel;

    }
    // =====================================================================

    // 기능 (메서드) : static 을 붙이지 마세요.

    // 춤추는 기능
    void dance(){
        System.out.println(genre + "춤을 열정적으로 춥니다.");
    }
    // 스트레칭을 하는 기능
    void stretch(){
        System.out.println("몸을 유연하게 풉니다.");
    }

    // 자기소개 기능
    String introduce() {
        // printf 형태로 return하고싶을때 String.format("")
        return String.format("내 이름은 %s이고, %s팀에 소속되어 있습니다.", dancerName, crewName);
    }


}
