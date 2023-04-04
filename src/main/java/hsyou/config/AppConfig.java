package hsyou.config;

import hsyou.user.MemberMemoryRepository;
import hsyou.user.MemberRepository;
import hsyou.user.MemberService;
import hsyou.user.MemberServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemberMemoryRepository();
    }

    @Bean
    public MemberService memberService(MemberRepository memberRepository) {
        return new MemberServiceImpl(memberRepository);
    }
}
