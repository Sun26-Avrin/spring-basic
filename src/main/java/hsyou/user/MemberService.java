package hsyou.user;

public interface MemberService {
    void join(Member member);
    Member findById(Long id);
}
