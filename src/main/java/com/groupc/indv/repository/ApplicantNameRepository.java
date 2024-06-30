package com.groupc.indv.repository;

import com.groupc.indv.model.Applicantname;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantNameRepository extends JpaRepository<Applicantname, Long> {
}