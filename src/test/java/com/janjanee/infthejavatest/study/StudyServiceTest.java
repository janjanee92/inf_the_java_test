package com.janjanee.infthejavatest.study;

import com.janjanee.infthejavatest.domain.Member;
import com.janjanee.infthejavatest.domain.Study;
import com.janjanee.infthejavatest.member.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {

    @Mock MemberService memberService;
    @Mock StudyRepository studyRepository;

    @Test
    void createNewStudy() {

        StudyService studyService = new StudyService(memberService, studyRepository);

        Study study = new Study(10, "테스트");

        Member member= new Member();
        member.setId(1L);
        member.setEmail("jan@gmail.com");

        when(memberService.findById(1L))
                .thenReturn(Optional.of(member));

        when(studyRepository.save(study))
                .thenReturn(study);

        member = memberService.findById(1L).get();

        studyService.createNewStudy(1L, study);
        assertEquals(member, study.getOwner());

        verify(memberService, times(1)).notify(study);
        verifyNoMoreInteractions(memberService);
        verify(memberService, times(1)).notify(member);


        InOrder inOrder = inOrder(memberService);
        inOrder.verify(memberService).notify(study);
        inOrder.verify(memberService).notify(member);

    }

}