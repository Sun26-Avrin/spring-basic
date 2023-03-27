package hsyou.user;

import java.util.HashMap;
import java.util.Map;

public class MemberMemoryRepository implements MemberRepository {

    private final Map<Long, Member> repository = new HashMap<>();

    @Override
    public void save(Member member) {
        repository.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return repository.get(id);
    }
}
