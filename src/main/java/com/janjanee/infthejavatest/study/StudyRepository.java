package com.janjanee.infthejavatest.study;

import com.janjanee.infthejavatest.domain.Study;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyRepository extends JpaRepository<Study, Long> {
}
