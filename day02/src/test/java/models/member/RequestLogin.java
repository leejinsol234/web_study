package models.member;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class RequestLogin { //요청 데이터
    private String userId;
    private String userPw;
}
