package exam01;

import lombok.*;

@Data //@Getter + @Setter + @ToString + @EqualsAndHashCode
//@AllArgsConstructor //모든 매개변수 초기화
//@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@NoArgsConstructor //기본 생성자 추가
//@EqualsAndHashCode //멤버변수 값들의 동등성 비교
//@RequiredArgsConstructor //상수인 매개변수들을 생성자 매개변수로 입력
public class Member {
    //private final String userId; //상수는 초기화가 꼭 필요하다. 직접 값을 입력하거나 생성자 매개변수로 만들어야 한다.
    private String userId;
    //@ToString.Exclude //특정 멤버 변수는 ToString에 포함시키지 않으려고 할 때
    //@NonNull //상수가 아닐 때 추가할 경우(변경이 필요해서)
    private String userPw;

    private String userNm;

}
