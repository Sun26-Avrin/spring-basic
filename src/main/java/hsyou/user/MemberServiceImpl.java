package hsyou.user;

public class MemberServiceImpl implements MemberService {

    MemberRepository memberRepository = new MemberMemoryRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(Long id) {
        return memberRepository.findById(id);
    }
}
