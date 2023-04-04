package hsyou.app;

import hsyou.config.AppConfig;
import hsyou.user.Grade;
import hsyou.user.Member;
import hsyou.user.MemberService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = ac.getBean(MemberService.class);

        Member member = new Member(1L, "hsyou", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findById(member.getId());

        System.out.println("member = " + findMember.getName());

    }
}
