package day10.exception;

public class LoginUser {

    String userAccount;  // 가입된 계정명
    String userPassword;  // 가입시 설정한 패스워드


    public LoginUser() {
    }

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    // 로그인 검증
    public String loginValidate(String inputAccount, String inputPassword) throws Exception {

        // 회원 계정이 존재하는가?
        if (userAccount.equals(inputAccount)){
            // 존재한다면 패스워드가 일치하는가?
            if(userPassword.equals(inputPassword)){
                // 로그인성공
                return "SUCCESS";
            } else {
                // 패스워드가 틀림   -> 발생시킬거야 새로운오류를 원인은 ()
                throw new LoginValidateException("비밀번호를 똑바로 쳐라");
            }
        } else {
            // 계정정보가 틀림
            throw new LoginValidateException("회원가입부터 하세요");
        }
    }
}
