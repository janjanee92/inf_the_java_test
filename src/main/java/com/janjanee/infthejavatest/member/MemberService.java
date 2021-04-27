package com.janjanee.infthejavatest.member;

import com.janjanee.infthejavatest.domain.Member;
import com.janjanee.infthejavatest.domain.Study;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findById(Long memberId);

    void validate(Long memberId);

    void notify(Study newstudy);

    void notify(Member member);
}
