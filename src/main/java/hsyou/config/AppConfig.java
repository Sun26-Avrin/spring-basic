package hsyou.config;

import hsyou.user.MemberMemoryRepository;
import hsyou.user.MemberRepository;
import hsyou.user.MemberService;
import hsyou.user.MemberServiceImpl;

public class AppConfig {

    public MemberRepository memberRepository() {
        return new MemberMemoryRepository();
    }

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }
}
