package hsyou.app;

import hsyou.user.Grade;
import hsyou.user.Member;
import hsyou.user.MemberService;
import hsyou.user.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "hsyou", Grade.VIP);

        memberService.join(member);

        Member findMember = memberService.findById(member.getId());

        System.out.println("member = " + findMember.getName());

    }
}
