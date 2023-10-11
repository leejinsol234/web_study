package tests;


import models.member.BadRequestException;
import models.member.JoinService;
import models.member.JoinValidator;
import models.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {

    private JoinService service;

    private Member getMember(){
        Member member = new Member();
        member.setUserId("user"+System.currentTimeMillis()); //기존에 추가된 아이디와 중복되지 않도록 난수 발생
        member.setUserNm("사용자");
        member.setUserPw("12345678");
        member.setConfirmUserPw(member.getUserPw());

        return member;
    }

    @BeforeEach //테스트하기 전에
    void init(){
        service = new JoinService(new JoinValidator()); //의존성을 외부에서 주입받는 형태
        //객체를 매번 만들 필요 없이 테스트 전에 객체 생성됨
    }
    @DisplayName("회원가입 성공 시 예외가 발생하지 않음")
    @Test
    void joinSucess(){
            assertDoesNotThrow(()->{
               //Member member = new Member();
               //JoinService service = new JoinService();
               service.join(getMember());
            });
    }
    @Test
    @DisplayName("필수 항목(userId, userPw, confirmUserPw, userNm) 검증, 검증 실패 시 BadRequestException 발생")
    void requiredFields(){
        assertAll(
        //예외 발생 시 하단 테스트는 진행되지 않을 때 예외 여부와 상관없이 assertAll로 모두 실행되도록 한다.
                () -> {
        //userId가 null, 또는 " "(빈 값)일 때
        Member member = getMember();
        member.setUserId(null);
        requiredFieldEach(member, "아이디");
        member.setUserId("  ");
        requiredFieldEach(member, "아이디");
                },
                () -> {
        //userPw가 null, 또는 " "(빈 값)일 때
        Member member = getMember();
        member.setUserPw(null);
        requiredFieldEach(member, "비밀번호");
        member.setUserPw("  ");
        requiredFieldEach(member, "비밀번호");
                },
                () -> {
        //confirmUserPw가 null, 또는 " "(빈 값)일 때
        Member member = getMember();
        member.setConfirmUserPw(null);
        requiredFieldEach(member, "비밀번호를 확인");
        member.setConfirmUserPw("  ");
        requiredFieldEach(member, "비밀번호를 확인");
                },
                () -> {
        //userNm가 null, 또는 " "(빈 값)일 때
        Member member = getMember();
        member.setUserNm(null);
        requiredFieldEach(member, "회원명");
        member.setUserNm("  ");
        requiredFieldEach(member, "회원명");
                }
        );

    }

    private void requiredFieldEach(Member member, String word){
        BadRequestException thrown = assertThrows(BadRequestException.class, ()-> {
            service.join(member);
        });

        assertTrue(thrown.getMessage().contains(word));
    }
}
