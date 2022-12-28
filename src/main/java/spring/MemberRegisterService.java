package spring;

import java.time.LocalDateTime;

public class MemberRegisterService {

    private MemberDao memberDao;

    // 생성자를 통해 의존 객체를 주입 받음
    public MemberRegisterService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public Long regist(RegisterRequest req) {
        // 주입 받은 의존 객체의 메서드를 사용
        Member member = memberDao.selectByEmail(req.getEmail());
            :
        memberDao.insert(newMember);
    }
}


@Configuration
public class AppCtx {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public MemberRegisterService memberRegSvc() {
        // 의존 객체를 생성자의 인자로 전달    
        return new MemberRegisterService(memberDao());
    }
            :
}

