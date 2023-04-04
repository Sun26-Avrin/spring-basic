package hsyou.app;

import hsyou.config.AppConfig;
import hsyou.user.Grade;
import hsyou.user.Member;
import hsyou.user.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "hsyou", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findById(member.getId());

        System.out.println("member = " + findMember.getName());

    }
}
