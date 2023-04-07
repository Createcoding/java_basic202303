package day10.exception;

// 에러 처리하는 클래스
public class LoginValidateException extends RuntimeException {

    // 기본생성자
    public LoginValidateException() {
    }


    // 에러메시지를 받는 생성자
    public LoginValidateException(String message) {
        super(message);
    }
}
