package com.janjanee.infthejavatest.member;

import com.janjanee.infthejavatest.domain.Member;

import java.util.Optional;

public interface MemberService {

    Optional<Member> findById(Long memberId);

    void validate(Long memberId);
}
