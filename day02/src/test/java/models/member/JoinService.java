package models.member;

import commons.Validator;

public class JoinService {

    Validator validator;
    public JoinService(Validator validator){ //확장을 위한 구조로 다형성 이용
        this.validator = validator;
    }
    public void join(Member member){
        validator.check(member); //검증에 대한 역할만 담당
    }
}
