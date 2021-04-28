package com.janjanee.infthejavatest.study;

import com.janjanee.infthejavatest.domain.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudyRepository extends JpaRepository<Study, Long> {
}
